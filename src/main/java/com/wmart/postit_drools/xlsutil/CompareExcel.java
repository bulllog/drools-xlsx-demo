package com.wmart.postit_drools.xlsutil;

import com.github.difflib.DiffUtils;
import com.github.difflib.algorithm.DiffException;
import com.github.difflib.patch.AbstractDelta;
import com.github.difflib.patch.ChangeDelta;
import com.github.difflib.patch.Patch;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class CompareExcel {

    public static void Diff(String orig, String rev) throws IOException, DiffException {
        //build simple lists of the lines of the two testfiles
        List<String> original = Files.readAllLines(new File(orig).toPath());
        List<String> revised = Files.readAllLines(new File(rev).toPath());

//compute the patch: this is the diffutils part
        Patch<String> patch = DiffUtils.diff(original, revised);

//simple output the computed patch to console
        for (AbstractDelta<String> delta : patch.getDeltas()) {
            System.out.println(delta);
        }
    }
}
