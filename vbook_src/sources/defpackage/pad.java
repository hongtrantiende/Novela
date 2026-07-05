package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pad  reason: default package */
/* loaded from: classes3.dex */
public final class pad {
    public final String a;
    public final ArrayList b;

    public pad(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof pad) {
                pad padVar = (pad) obj;
                if (!this.a.equals(padVar.a) || !this.b.equals(padVar.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "VideoSection(title=" + this.a + ", tocLinks=" + this.b + ")";
    }
}
