package com.google.ads.interactivemedia.v3.impl.data;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
final class AutoValue_IconClickFallbackImageMsgData extends IconClickFallbackImageMsgData {
    private final String alternateText;
    private final String creativeType;
    private final int height;
    private final String imageUrl;
    private final int width;

    public AutoValue_IconClickFallbackImageMsgData(int i, int i2, String str, String str2, String str3) {
        this.width = i;
        this.height = i2;
        if (str != null) {
            this.imageUrl = str;
            if (str2 != null) {
                this.alternateText = str2;
                if (str3 != null) {
                    this.creativeType = str3;
                    return;
                } else {
                    xk5.k("Null creativeType");
                    throw null;
                }
            }
            xk5.k("Null alternateText");
            throw null;
        }
        xk5.k("Null imageUrl");
        throw null;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.IconClickFallbackImageMsgData
    public String alternateText() {
        return this.alternateText;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.IconClickFallbackImageMsgData
    public String creativeType() {
        return this.creativeType;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof IconClickFallbackImageMsgData) {
            IconClickFallbackImageMsgData iconClickFallbackImageMsgData = (IconClickFallbackImageMsgData) obj;
            if (this.width == iconClickFallbackImageMsgData.width() && this.height == iconClickFallbackImageMsgData.height() && this.imageUrl.equals(iconClickFallbackImageMsgData.imageUrl()) && this.alternateText.equals(iconClickFallbackImageMsgData.alternateText()) && this.creativeType.equals(iconClickFallbackImageMsgData.creativeType())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((this.width ^ 1000003) * 1000003) ^ this.height) * 1000003) ^ this.imageUrl.hashCode();
        return this.creativeType.hashCode() ^ (((hashCode * 1000003) ^ this.alternateText.hashCode()) * 1000003);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.IconClickFallbackImageMsgData
    public int height() {
        return this.height;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.IconClickFallbackImageMsgData
    public String imageUrl() {
        return this.imageUrl;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.IconClickFallbackImageMsgData
    public int width() {
        return this.width;
    }
}
