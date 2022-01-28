package class_3;

import empty_categories_classes.SmokeCategory;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
//Test Case – set of steps
//Test Suite – collection of test cases

@RunWith(Categories.class)
@Suite.SuiteClasses(CalculatorDivMethodTest.class) // here we are calling the whole classes with all test cases
@Categories.IncludeCategory({SmokeCategory.class}) // calling categories(Group test cases under some categories)

public class Runner {

}

