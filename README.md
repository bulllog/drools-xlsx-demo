# drools_poc_xlsx
POC for drools with configuring the rules using xlsx sheet.

## Resources required
1) Java 1.8
2) Maven 3.6

## Setup Instructions
1) Clone directory to local disc.
2) Setup project with maven and build
3) To run the example, goto src/main/java/com/wmart/postit_drools/driver and Run Drive.java with main() method.


## Important files
1) Rule Configuration - src/main/java/resources/rules/v1/postit_rule_backup.xlsx.
2) Generated drl files - src/main/java/resources/generated_rules.drl. This file will not be updated automatically. It is just for the reference.
3) Source for LineItem - src/main/java/resources/post_it_source.json

##Help Docs
1) [medium blog](https://medium.com/@talfco/tutorial-drools-decision-tables-in-excel-for-a-product-proposal-59c6b438a3f5)
2) [Installation and setup](https://technicalmumbojumbo.wordpress.com/2009/03/28/jboss-drools-decision-tables/)