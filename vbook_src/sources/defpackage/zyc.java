package defpackage;

import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zyc  reason: default package */
/* loaded from: classes.dex */
public final class zyc extends wk5 {
    public final String b;
    public final String c;

    public zyc(String str, String str2, String str3) {
        super(str);
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && zyc.class == obj.getClass()) {
                zyc zycVar = (zyc) obj;
                if (this.a.equals(zycVar.a) && Objects.equals(this.b, zycVar.b) && this.c.equals(zycVar.c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int j = eub.j(527, 31, this.a);
        String str = this.b;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return this.c.hashCode() + ((j + i) * 31);
    }

    @Override // defpackage.wk5
    public final String toString() {
        return this.a + ": url=" + this.c;
    }
}
