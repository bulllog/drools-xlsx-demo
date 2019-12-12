package com.wmart.postit_drools.drools;

import com.github.difflib.algorithm.DiffException;
import com.wmart.postit_drools.drools.config.DroolsBeanFactory;
import com.wmart.postit_drools.posit.model.LineItemPojo;
import com.wmart.postit_drools.xlsutil.CompareExcel;
import org.kie.api.io.Resource;
import org.kie.api.runtime.KieSession;
import org.kie.internal.io.ResourceFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class KieFileSystemContainer {

    KieSession kieSession;
    private static final String RESOURCE = "src/main/resources/";
    private static final String FILE_PATH = "rules/v1/postit_rule_backup.xlsx";
    private static final String FILE_PATH_CHANGED = "rules/v1/postit_rule_backup_changed.xlsx";
    private boolean debug = false;
    private boolean withDrlStr = false;
    private boolean withSheet = false;

    public KieFileSystemContainer build() {
        if(!withDrlStr) {
            withSheet = true;
        }
        kieFileSystem();
        return this;
    }

    public KieFileSystemContainer() {
    }

    public KieFileSystemContainer(boolean debug) {
        this.debug = debug;
    }

    public KieFileSystemContainer setWithDrlStr(boolean f) {
        System.out.println("KIE SESSION will be created with drl string");
        this.withDrlStr = true;
        return this;
    }


    public void kieFileSystem() {
        Resource dt
                = ResourceFactory
                .newClassPathResource(FILE_PATH,
                        getClass());

        DroolsBeanFactory droolsBeanFactory = new DroolsBeanFactory();
        String drl = "";
        if(debug || withDrlStr) {
            drl = droolsBeanFactory.getDrlFromExcel(FILE_PATH);
            if(debug) {
                System.out.println("Generated DRL - " + drl);
                droolsBeanFactory.verfiy(drl);
            }
        }
        if(withDrlStr) {
            kieSession = droolsBeanFactory.getKieSession(drl);
        } else {
            kieSession = droolsBeanFactory.getKieSession(dt);
        }
    }


    public void execute(LineItemPojo item) {
        kieSession.insert(item);
        kieSession.fireAllRules();
    }

    public List<LineItemPojo> execute(List<LineItemPojo> items) {
        List<LineItemPojo> result = new ArrayList<>();
        for (LineItemPojo c : items) {
            kieSession.insert(c);
        }
        kieSession.setGlobal("result", result);
        kieSession.fireAllRules();
        return result;
    }

    public static void delta() {
        try {
            CompareExcel.Diff(RESOURCE+FILE_PATH, RESOURCE+FILE_PATH_CHANGED);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (DiffException e) {
            e.printStackTrace();
        }
    }
}
