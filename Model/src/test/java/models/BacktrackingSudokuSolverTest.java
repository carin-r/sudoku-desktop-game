package solver;

import org.junit.jupiter.api.Test;
import sudoku.model.models.SudokuBoard;
import sudoku.model.solver.BacktrackingSudokuSolver;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class BacktrackingSudokuSolverTest {

    @Test
    void testIsValidPlacementReturnsFalseForRowConflict() {
        // Arrange
        BacktrackingSudokuSolver solver = new BacktrackingSudokuSolver();
        SudokuBoard board = new SudokuBoard(solver);

        // Place a 5 in row 0, column 0
        board.setField(0, 0, 5);

        // Act: try placing another 5 in the same row
        boolean result = solver.isValidPlacement(0, 1, 5, board);

        // Assert
        assertFalse(result);
    }
}