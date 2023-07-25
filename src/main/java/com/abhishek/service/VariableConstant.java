package com.abhishek.service;


public class VariableConstant {

    public static final String EMAIL_BODY_WITH_IMAGE(String title, String content, String userId) {
        String emailBody = "<html>\n" +
                "<head>\n" +
                "  <meta charset=\"UTF-8\">\n" +
                "  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
                "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "  <title>Certification</title>\n" +
                "  <link href=\"http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700\" rel=\"stylesheet\" type=\"text/css\">\n" +
                "  <style>\n" +
                "    ul li {\n" +
                "      margin: 12px 0;\n" +
                "    }\n" +
                "  </style>\n" +
                "</head>\n" +
                "\n" +
                "<body>\n";
        String DEFAULT_EMAIL_CONTENT = "    Hello " + userId + ",<br>\n" +
                "    Thank you for purchasing " + title + " insurance.<br>\n" +
                "    <div style=\"padding-top: 12px;\">You will find the below mentioned documents attached to this email:</div>\n" +
                "  <ul>\n" +
                "    <li>Your " + title + " Certificate</li>\n" +
                "  </ul>\n" +
                "  </div>\n";
                emailBody = emailBody + "  <div style=\"text-align: center;\">\n" +
                        "    <img src=\"https://d15ymu0lcwxhb8.cloudfront.net/files/static/banners/DD8F334F-7D01-4368-B13A-61C58E4C681E_1_201_a.jpeg\" alt=\"Flowers in Certificate of Protection Emailer\" width=\"100%\" height=\"auto\">\n" +
                        "  </div>\n" +
                        "  <div style=\"padding: 2% 8%; font-size: 16px; line-height: 28px;\">\n" +
                        "    Hello " + title + ",<br>\n" +
                        "    Thank you for insuring your gadget with Turtlemint Gadget Protect.<br>\n" +
                        "    Your Plan has now been activated.The validity of your plan is from  to .<br>\n" +
                        "    <div style=\"padding-top: 12px;\">You will find the below mentioned documents attached to this email:</div>\n" +
                        "  <ul>\n" +
                        "    <li>Your Gadget Protect Certificate</li>\n" +
                        "    <li>Tax Invoice</li>\n" +
                        "    <li>Terms and conditions</li>\n" +
                        "  </ul>\n" +
                        "  </div>\n" +
                        "  <div style=\"text-align: center;\">\n" + content+
                        "    <img src=\"https://d15ymu0lcwxhb8.cloudfront.net/files/static/banners/C7FED6E5-DCE3-42B7-B7D9-96E3623CCF5E_4_5005_c.jpeg\" alt=\"Claim Process\" width=\"100%\" height=\"auto\">\n" +
                        "  </div>\n" + "  <div style=\"padding: 2% 8%; font-size: 16px; line-height: 24px;\">\n" +
                        "    Please note that this information is based on your application form. In case of any discrepancies please reach out to us on Turtlemint-gp@assurant.com or call us at 1800 266 6468\n" +
                        "    <div style=\"padding-top: 12px;\">Regards,<br>\n" +
                        "    <span style=\"color: green;\">Team Turtlemint Gadget Protect</span>\n" +
                        "    </div>\n" +
                        "  </div>\n" +
                        "</body>\n" +
                        "</html>";
        return emailBody;
    }

}