package cs;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class BlockudockuTest {

    public void createTest() {
        Blockudocku game = new Blockudocku();
        Assert.assertEquals(game.board[0][0], 0);
    }

    public void placeATest(){
        Blockudocku game = new Blockudocku();
        Boolean validate = game.validatePlacement(Blockudocku.Piece.A, 0,0);
        Assert.assertEquals(validate, Boolean.TRUE);
        Boolean insertion = game.placePiece(Blockudocku.Piece.A, 0, 0);
        Assert.assertEquals(insertion, Boolean.TRUE);
        validate = game.validatePlacement(Blockudocku.Piece.A, 0,0);
        Assert.assertEquals(validate, Boolean.FALSE);
    }
    public void placeBTest(){
        Blockudocku game = new Blockudocku();
        Boolean validate = game.validatePlacement(Blockudocku.Piece.B, 2,2);
        Assert.assertEquals(validate, Boolean.TRUE);
        Boolean insertion = game.placePiece(Blockudocku.Piece.B, 2, 2);
        Assert.assertEquals(insertion, Boolean.TRUE);
        validate = game.validatePlacement(Blockudocku.Piece.B, 2,2);
        Assert.assertEquals(validate, Boolean.FALSE);
    }
    public void placeCTest(){
        Blockudocku game = new Blockudocku();
        Boolean validate = game.validatePlacement(Blockudocku.Piece.C, 2,2);
        Assert.assertEquals(validate, Boolean.TRUE);
        Boolean insertion = game.placePiece(Blockudocku.Piece.C, 2, 2);
        Assert.assertEquals(insertion, Boolean.TRUE);
        validate = game.validatePlacement(Blockudocku.Piece.C, 2,2);
        Assert.assertEquals(validate, Boolean.FALSE);
    }
    public void placeDTest(){
        Blockudocku game = new Blockudocku();
        Boolean validate = game.validatePlacement(Blockudocku.Piece.D, 2,2);
        Assert.assertEquals(validate, Boolean.TRUE);
        Boolean insertion = game.placePiece(Blockudocku.Piece.D, 2, 2);
        Assert.assertEquals(insertion, Boolean.TRUE);
        validate = game.validatePlacement(Blockudocku.Piece.D, 2,2);
        Assert.assertEquals(validate, Boolean.FALSE);
    }
    public void placeETest(){
        Blockudocku game = new Blockudocku();
        Boolean validate = game.validatePlacement(Blockudocku.Piece.E, 2,2);
        Assert.assertEquals(validate, Boolean.TRUE);
        Boolean insertion = game.placePiece(Blockudocku.Piece.E, 2, 2);
        Assert.assertEquals(insertion, Boolean.TRUE);
        validate = game.validatePlacement(Blockudocku.Piece.E, 2,2);
        Assert.assertEquals(validate, Boolean.FALSE);
    }
    public void placeFTest(){
        Blockudocku game = new Blockudocku();
        Boolean validate = game.validatePlacement(Blockudocku.Piece.F, 2,2);
        Assert.assertEquals(validate, Boolean.TRUE);
        Boolean insertion = game.placePiece(Blockudocku.Piece.F, 2, 2);
        Assert.assertEquals(insertion, Boolean.TRUE);
        validate = game.validatePlacement(Blockudocku.Piece.F, 2,2);
        Assert.assertEquals(validate, Boolean.FALSE);
    }
    public void placeGTest(){
        Blockudocku game = new Blockudocku();
        Boolean validate = game.validatePlacement(Blockudocku.Piece.G, 2,2);
        Assert.assertEquals(validate, Boolean.TRUE);
        Boolean insertion = game.placePiece(Blockudocku.Piece.G, 2, 2);
        Assert.assertEquals(insertion, Boolean.TRUE);
        validate = game.validatePlacement(Blockudocku.Piece.G, 2,2);
        Assert.assertEquals(validate, Boolean.FALSE);
    }
    public void placeHTest(){
        Blockudocku game = new Blockudocku();
        Boolean validate = game.validatePlacement(Blockudocku.Piece.H, 2,2);
        Assert.assertEquals(validate, Boolean.TRUE);
        Boolean insertion = game.placePiece(Blockudocku.Piece.H, 2, 2);
        Assert.assertEquals(insertion, Boolean.TRUE);
        validate = game.validatePlacement(Blockudocku.Piece.H, 2,2);
        Assert.assertEquals(validate, Boolean.FALSE);
    }


}
