/**
 * Returns the size of the source scaled to the target. Note the same Vector2 instance is always returned and should never be
 * cached.
 */
public Vector2 apply(float sourceWidth, float sourceHeight, float targetWidth, float targetHeight) {
    switch(this) {
        case fit:
            {
                float targetRatio = targetHeight / targetWidth;
                float sourceRatio = sourceHeight / sourceWidth;
                float scale = targetRatio > sourceRatio ? targetWidth / sourceWidth : targetHeight / sourceHeight;
                temp.x = sourceWidth * scale;
                temp.y = sourceHeight * scale;
                break;
            }
        case fill:
            {
                float targetRatio = targetHeight / targetWidth;
                float sourceRatio = sourceHeight / sourceWidth;
                float scale = targetRatio < sourceRatio ? targetWidth / sourceWidth : targetHeight / sourceHeight;
                temp.x = sourceWidth * scale;
                temp.y = sourceHeight * scale;
                break;
            }
        case fillX:
            {
                float scale = targetWidth / sourceWidth;
                temp.x = sourceWidth * scale;
                temp.y = sourceHeight * scale;
                break;
            }
        case fillY:
            {
                float scale = targetHeight / sourceHeight;
                temp.x = sourceWidth * scale;
                temp.y = sourceHeight * scale;
                break;
            }
        case stretch:
            temp.x = targetWidth;
            temp.y = targetHeight;
            break;
        case stretchX:
            temp.x = targetWidth;
            temp.y = sourceHeight;
            break;
        case stretchY:
            temp.x = sourceWidth;
            temp.y = targetHeight;
            break;
        case none:
            temp.x = sourceWidth;
            temp.y = sourceHeight;
            break;
    }
    return temp;
}
