public class CircleWithStaticMethods {
        /** The number of the nonstatic methods called(or used in the runner) */
        private static int numberOfNonStaticMethodCalls = 0;
        /** The number of the objects created */
        private static int numberOfObjects = 0;
        /** The number of the static methods called(or used in the runner) */
        private static int numberOfStaticMethodCalls = 0;
        /** The radius of the circle */

        private double radius;

        /** Construct a circle with radius 1 */
        public CircleWithStaticMethods(){
            radius = 1;
            numberOfObjects++;
        }

        /** Construct a circle with a specified radius */
        public CircleWithStaticMethods(double  newRadius){
            radius = newRadius;
            numberOfObjects++;
        }
        /** return the area of this circle */
        public double getArea(){
            numberOfNonStaticMethodCalls++;
            return Math.pow(radius,2) * Math.PI;
        }
        /** return the circumference of this circle */
        public double getCircumference(){
            numberOfNonStaticMethodCalls++;
            return Math.PI * radius * 2;
        }
        /** return numberOfNonStaticMethodCalls */
        public static int getNumberOfNonStaticCalls(){
            numberOfStaticMethodCalls++;
            return numberOfNonStaticMethodCalls;
        }
        /** return numberOfObjects;*/
        public static int getNumberOfObjects(){
            numberOfStaticMethodCalls++;
            return numberOfObjects;
        }
       /** return numberOfStaticMethodCalls;*/
        public static int getNumberOfStaticCalls(){
            numberOfStaticMethodCalls++;
            return numberOfStaticMethodCalls;
        }

        /** reports te number of objects created, the number of static methods calls and the number 0f non-static methods calls*/
        public static void printClassAndMethodInfo(){
            numberOfStaticMethodCalls++;
            System.out.println("there are " + getNumberOfObjects() + " Objects"
                    + "\nthere are "+ getNumberOfStaticCalls() + " Static Methods Calls"
                    + "\nthere are "+ getNumberOfNonStaticCalls() + " Non Static Methods Calls");
        }

    }
