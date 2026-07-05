package com.google.ads.interactivemedia.v3.impl.data;

import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public class UiElementImpl {
    public static final uff GSON_TYPE_ADAPTER = new uff() { // from class: com.google.ads.interactivemedia.v3.impl.data.UiElementImpl.1
        @Override // defpackage.uff
        public UiElementImpl read(tyd tydVar) {
            if (tydVar.l1() == 9) {
                tydVar.V0();
                return new UiElementImpl("");
            }
            return new UiElementImpl(tydVar.I0());
        }

        @Override // defpackage.uff
        public void write(uyd uydVar, UiElementImpl uiElementImpl) {
            if (uiElementImpl == null) {
                uydVar.y0();
            } else {
                uydVar.j0(uiElementImpl.getName());
            }
        }
    };
    private final String name;

    public UiElementImpl(String str) {
        this.name = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UiElementImpl)) {
            return false;
        }
        return this.name.equals(((UiElementImpl) obj).name);
    }

    public String getName() {
        return this.name;
    }

    public int hashCode() {
        return Objects.hash(this.name);
    }

    public String toString() {
        String str = this.name;
        return nk2.v(new StringBuilder(String.valueOf(str).length() + 20), "UiElementImpl[name=", str, "]");
    }
}
