public class Profile {
        private String name;
        private int age;
        private String subject;
        private String hobby;
        private String food;
        public Profile(String aName, int aAge, String aSubject, String ahobby, String afood){
            name = aName;
            age = aAge;
            subject = aSubject;
            hobby = ahobby;
            food = afood;
        }
        public void printinfo(){
            System.out.println("your name is " + name);
            System.out.println("your age is " + age);
            System.out.println("your favorite subject is " + subject);
            System.out.println("your favorite hobby is " + hobby);
            System.out.println("your favorite food is " + food);
            printCareer();
        }
        public void updateProfile(String aName, int aAge, String aSubject, String ahobby, String afood){
            name = aName;
            age = aAge;
            subject = aSubject;
            hobby = ahobby;
            food = afood;
        }
        private void printCareer(){
            if (subject.equals("Math")){
                if(hobby.equals("Painting")){
                    if(food.equals("Sushi")){
                        System.out.println("Teaching: If you're passionate about any of these interests, consider teaching. You could become a math teacher, art teacher, or culinary instructor, depending on which interest you'd like to share with others.");
                    }
                    if(food.equals("Pizza")){
                        System.out.println("Pizza Restaurant Designer: Combine your love for painting and math by working as an interior designer or decorator specializing in pizza restaurants. You'd be responsible for creating visually appealing restaurant spaces that incorporate mathematical principles in terms of layout and proportions.");
                    }
                }
                if(hobby.equals("Running")){
                    if(food.equals("Sushi")){
                        System.out.println("You should be a sushi chef");
                    }
                    if(food.equals("Pizza")){
                        System.out.println("You should be a math and fitness youtuber");
                    }
                }
            }
            else if (subject.equals("Science")){
                if(hobby.equals("Painting")){
                    if(food.equals("Pizza")){
                        System.out.println("You should be a design teacher");
                    }
                    if(food.equals("Sushi")){
                        System.out.println("You should be a ai artist");
                    }
                }
                if(hobby.equals("Running")){
                    if(food.equals("Pizza")){
                        System.out.println("You should be a gym instructer");
                    }
                    if(food.equals("Sushi")){
                        System.out.println("You should be a restraunt manager");
                    }
                }
            }
            else if (subject.equals("History")){
                if(hobby.equals("Painting")){
                    if(food.equals("Pizza")){
                        System.out.println("You should be a museum curator");
                    }
                    if(food.equals("Sushi")){
                        System.out.println("You should be a Vlogger");
                    }
                }
                if(hobby.equals("Running")){
                    if(food.equals("Pizza")){
                        System.out.println("You should be Mr. Bowen, my history teacher");
                    }
                    if(food.equals("Sushi")){
                        System.out.println("You should be a Apple store employee");
                    }
                }
            }
        }
}
