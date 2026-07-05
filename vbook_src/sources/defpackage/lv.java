package defpackage;

import java.util.Arrays;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lv  reason: default package */
/* loaded from: classes.dex */
public final class lv extends wk5 {
    public final String b;
    public final String c;
    public final int d;
    public final byte[] e;

    public lv(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = bArr;
    }

    @Override // defpackage.rb7
    public final void b(i57 i57Var) {
        i57Var.a(this.e, this.d);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && lv.class == obj.getClass()) {
                lv lvVar = (lv) obj;
                if (this.d == lvVar.d && this.b.equals(lvVar.b) && Objects.equals(this.c, lvVar.c) && Arrays.equals(this.e, lvVar.e)) {
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
        int j = eub.j((527 + this.d) * 31, 31, this.b);
        String str = this.c;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return Arrays.hashCode(this.e) + ((j + i) * 31);
    }

    @Override // defpackage.wk5
    public final String toString() {
        return this.a + ": mimeType=" + this.b + ", description=" + this.c;
    }
}
