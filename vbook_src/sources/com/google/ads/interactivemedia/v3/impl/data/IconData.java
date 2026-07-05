package com.google.ads.interactivemedia.v3.impl.data;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public abstract class IconData implements fxd {
    public abstract String alternateText();

    public abstract int duration();

    public abstract List<IconClickFallbackImageMsgData> fallbackImages();

    public int getDuration() {
        return duration();
    }

    public int getHeight() {
        return height();
    }

    public List getIconClickFallbackImages() {
        ArrayList arrayList = new ArrayList();
        for (IconClickFallbackImageMsgData iconClickFallbackImageMsgData : fallbackImages()) {
            arrayList.add(iconClickFallbackImageMsgData);
        }
        return arrayList;
    }

    @Override // defpackage.fxd
    public int getId() {
        return id();
    }

    public int getOffset() {
        return offset();
    }

    public double getPixelRatio() {
        return pixelRatio();
    }

    public String getResourceUri() {
        return imageUrl();
    }

    public int getWidth() {
        return width();
    }

    public String getXPosition() {
        return xPosition();
    }

    public String getYPosition() {
        return yPosition();
    }

    public abstract int height();

    public abstract int id();

    public abstract String imageUrl();

    public abstract int offset();

    public abstract double pixelRatio();

    public abstract int width();

    public abstract String xPosition();

    public abstract String yPosition();
}
