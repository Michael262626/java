public class Main5 {
    public String aboutTheApp(String response) {
        if (!response.equalsIgnoreCase("yes")) {
           return "To know more about this app type yes or no to continue the app";
        } else if (!response.equalsIgnoreCase("no")) {
           return "To know more about this app type yes or no to continue the app";
        } else {
            int count = 0;
            while (response.equalsIgnoreCase("yes")) {
               return ("This app is to give you a brief knowledge about menstral cycle and hygiene. And also  lessens the myths and confusion around it.\nMenstrual Cycle\n" +
                        "A menstrual cycle begins when you get your period or menstruate. This is when you shed the lining of your uterus. This cycle is part of your reproductive system and prepares your body for a possible pregnancy. A typical cycle lasts between 24 and 38 days.\nMenstruation is the monthly shedding of the lining of your uterus. Menstruation is also known by the terms menses, menstrual period, menstrual cycle or period. Menstrual blood — which is partly blood and partly tissue from the inside of your uterus — flows from your uterus through your cervix and out of your body through your vagina.\nMenstruation is driven by hormones. Hormones are chemical messengers in your body. Your pituitary gland (in your brain) and your ovaries (part of your reproductive system) make and release certain hormones at certain times during your menstrual cycle.\n" +
                        "\n" +
                        "These hormones cause the lining of your uterus to thicken. This happens so that if a pregnancy would occur, an egg can implant into your uterine lining. Hormones also cause your ovaries to release an egg (ovulation). The egg moves down your fallopian tubes, where it waits for sperm. If a sperm doesn’t fertilize that egg, pregnancy doesn’t occur. The lining of your uterus breaks down and sheds. This is your period.");
                count++;
            }

        }

    }

    public String genderCheck(String gender) {
        int count = 0;
        if (gender.equalsIgnoreCase("female")) {
            return "you are allowed to use this app :)";
        } else if (gender.equalsIgnoreCase("male")) {
            return "Sorry this app is restricted for you\nonly female are allowed";
        } else {
            return "invalid gender type";
            while (gender.equalsIgnoreCase("female")) {
                return "you are allowed to use this app :)";
                if (gender.equalsIgnoreCase("female")) {
                    return "you are allowed to use this app :)";
                } else if (gender.equalsIgnoreCase("male")) {
                    return "Sorry this app is restricted for you\nonly female are allowed";
                } else {
                    return "invalid gender type";
                }
                count++;
            }
	}
        }
        public String checkAge(int age) {
        if(age <= 8){
            return "You have to be from 8 above to experience your period";
        }
        else{
            return "Your next period is";
        }
        }
    }
    