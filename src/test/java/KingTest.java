import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import sda.games.chess.King;
import sda.games.chess.Move;
import sda.games.chess.Player;

import static org.assertj.core.api.Assertions.assertThat;

public class KingTest {
  King king;
@Before
public void createKing(){
  king = new King();
}



  @Test
    public void shouldAllowMovingDown(){

    Move move = new Move(0,2,0,3);
    assertThat(king.isMoveValid(move)).isTrue();
  }

  @Test
  public void shouldAllowMovingUp(){

    Move move = new Move(3,1,3,2);
    assertThat(king.isMoveValid(move)).isTrue();
  }

  @Test
  public void shouldAllowMovingRight(){

    Move move = new Move(6,1,7,1);
    assertThat(king.isMoveValid(move)).isTrue();
  }

  @Test
  public void shouldAllowMovingLeft(){

    Move move = new Move(5,1,4,1);
    assertThat(king.isMoveValid(move)).isTrue();
  }


  @Test
  public void shouldAllowMovingUpAndRight(){

    Move move = new Move(5,1,6,0);
    assertThat(king.isMoveValid(move)).isTrue();
  }

  @Test
  public void shouldAllowMovingUpAndLeft(){

    Move move = new Move(5,1,4,0);
    assertThat(king.isMoveValid(move)).isTrue();
  }
  @Test
  public void shouldAllowMovingDownAndLeft(){

    Move move = new Move(4,3,3,4);
    assertThat(king.isMoveValid(move)).isTrue();
  }

  @Test
  public void shouldAllowMovingDownAndRight(){

    Move move = new Move(4,3,5,4);
    assertThat(king.isMoveValid(move)).isTrue();
  }
  @Test
  public void shouldNotAllowMovingTwoSpotsToLeft(){

    Move move = new Move(2,3,0,3);
    assertThat(king.isMoveValid(move)).isFalse();
  }
  @Test
  public void shouldNotAllowMovingTwoSpotsToRight(){

    Move move = new Move(2,3,5,3);
    assertThat(king.isMoveValid(move)).isFalse();
  }

  @Test
  public void shouldNotAllowMovingTwoSpotsDown(){

    Move move = new Move(2,3,2,5);
    assertThat(king.isMoveValid(move)).isFalse();
  }

  @Test
  public void shouldNotAllowPlaceInTheSameSpot(){

    Move move = new Move(2,3,2,3);
    assertThat(king.isMoveValid(move)).isFalse();
  }
}
