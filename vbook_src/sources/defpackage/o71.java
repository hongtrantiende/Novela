package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: o71  reason: default package */
/* loaded from: classes3.dex */
public final class o71 {
    public final Map a;

    public o71(Map map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof o71) || !this.a.equals(((o71) obj).a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CascadeEditorBlockStrings(blocks=" + this.a + ")";
    }
}
