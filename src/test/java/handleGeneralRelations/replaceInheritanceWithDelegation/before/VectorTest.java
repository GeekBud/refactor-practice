package handleGeneralRelations.replaceInheritanceWithDelegation.before;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Objects;


class VectorTest {

    @Test
    public void beforeTest(){
        Stack stack = new Stack();
        handleGeneralRelations.replaceInheritanceWithDelegation.after.Stack  afterStack= new handleGeneralRelations.replaceInheritanceWithDelegation.after.Stack();
        Assert.assertTrue(Objects.equals(stack.imSuperMethod(),afterStack.imSuperMethod()));
        stack.imSuperMethod();
    }
}