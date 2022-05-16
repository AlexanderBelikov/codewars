package info.belikov.codewars.k6;

public class Spiralizor {

    public static int[][] spiralize(int size) {
        int[][] result = new int[size][size];

        int layersCount = (int)Math.ceil((double)size/4) - 1;

        // Layers
        if (layersCount > 0) {
            int layerSize = 2;
            for (int layerId = 0; layerId < layersCount; layerId++) {
                int layerStart =  layerId * layerSize;
                int layerEnd = size - layerStart;

                for (int z = layerStart; z < layerEnd; z++) {
                    result[layerStart][z] = 1;
                    result[z][layerStart] = 1;
                    result[layerEnd-1][z] = 1;
                    result[z][layerEnd-1] = 1;
                }
                result[layerStart+1][layerStart] = 0;
                result[layerStart+2][layerStart+1] = 1;
            }
        }

        // Core
        int startCore = layersCount * 2;
        int endCore = size - layersCount * 4 + startCore;

        for (int c = startCore; c < endCore; c++) {
            result[startCore][c] = 1;
            result[c][startCore] = 1;
            result[endCore-1][c] = 1;
            result[c][endCore-1] = 1;
        }

        if (endCore - startCore > 1) {
            result[startCore+1][startCore] = 0;
        }

        return result;
    }
}