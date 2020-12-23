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

    public void doublePlacementTest(){
        Blockudocku game = new Blockudocku();
        Boolean validate = game.validatePlacement(Blockudocku.Piece.H, 2,2);
        Assert.assertEquals(validate, Boolean.TRUE);
        Boolean insertion = game.placePiece(Blockudocku.Piece.H, 2, 2);
        Assert.assertEquals(insertion, Boolean.TRUE);
        insertion = game.placePiece(Blockudocku.Piece.H, 2, 2);
        Assert.assertEquals(insertion, Boolean.FALSE);
    }

    public void verticalTest(){
        Blockudocku game = new Blockudocku();
        Assert.assertEquals(game.points, 0);
        game.placePiece(Blockudocku.Piece.D, 0, 0);
        game.placePiece(Blockudocku.Piece.D, 0, 3);
        game.placePiece(Blockudocku.Piece.D, 0, 6);
        game.validateVertical();
        Assert.assertEquals(game.points, 120);
    }

    public void horizontalTest(){
        Blockudocku game = new Blockudocku();
        Assert.assertEquals(game.points, 0);
        game.placePiece(Blockudocku.Piece.C, 2, 0);
        game.placePiece(Blockudocku.Piece.C, 5, 0);
        game.placePiece(Blockudocku.Piece.C, 8, 0);
        game.validateHorizontal();
        Assert.assertEquals(game.points, 120);
    }

    public void blockTest() {
        Blockudocku game = new Blockudocku();
        Assert.assertEquals(game.points, 0);
        game.placePiece(Blockudocku.Piece.D, 0, 0);
        game.placePiece(Blockudocku.Piece.D, 1, 0);
        game.placePiece(Blockudocku.Piece.D, 2, 0);
        game.validateBlocks();
        Assert.assertEquals(game.points, 150);
    }


}
