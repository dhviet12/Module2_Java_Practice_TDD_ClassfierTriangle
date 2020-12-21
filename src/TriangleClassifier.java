public class TriangleClassifier {
    public static String classfier(int inputFirstSide, int inputSecondSide, int inputThirdSide) {
        String result = "";

        boolean isFirstSideEqualSecondSide = inputFirstSide == inputSecondSide;
        boolean isSecongSideEqualThirdSide = inputSecondSide == inputThirdSide;
        boolean isFirstSideNotEqualSecondSide = inputFirstSide != inputSecondSide;
        boolean isFirstSideNotEqualThirdSide = inputFirstSide != inputThirdSide;

        boolean isEquilateralTriangle = isFirstSideEqualSecondSide && isSecongSideEqualThirdSide;
        boolean isIsoscelesTriangle = isFirstSideEqualSecondSide && isFirstSideNotEqualThirdSide;
        boolean isNormalTriangle = isFirstSideNotEqualSecondSide && isFirstSideNotEqualThirdSide;

        boolean notTriangle = inputFirstSide >= inputSecondSide + inputThirdSide || inputSecondSide >= inputFirstSide + inputThirdSide || inputThirdSide >= inputFirstSide + inputSecondSide;

        if (notTriangle) {
            result = "Not a Triangle";
        } else if (isEquilateralTriangle) {
            result = "Equilateral Triangle";
        } else if (isIsoscelesTriangle) {
            result = "Isosceles Triangle";
        } else if (isNormalTriangle) {
            result = "Normal Triangle";
        }
        return result;
    }

}


