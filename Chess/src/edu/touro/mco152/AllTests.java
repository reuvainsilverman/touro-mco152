package edu.touro.mco152;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ BoardTest.class, PawnTest.class , CharacterTest.class, testWhitespace.class})
public class AllTests {

}
