package com.google.ads.interactivemedia.v3.impl.data;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
final class AutoValue_IconsViewData extends IconsViewData {
    private final List<IconData> icons;

    public AutoValue_IconsViewData(List<IconData> list) {
        if (list != null) {
            this.icons = list;
        } else {
            xk5.k("Null icons");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof IconsViewData) {
            return this.icons.equals(((IconsViewData) obj).icons());
        }
        return false;
    }

    public int hashCode() {
        return this.icons.hashCode() ^ 1000003;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.IconsViewData
    public List<IconData> icons() {
        return this.icons;
    }

    public String toString() {
        String valueOf = String.valueOf(this.icons);
        return nk2.v(new StringBuilder(valueOf.length() + 21), "IconsViewData{icons=", valueOf, "}");
    }
}
