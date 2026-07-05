package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bq4  reason: default package */
/* loaded from: classes.dex */
public final class bq4 {
    public final List a;

    public bq4(yp4... yp4VarArr) {
        for (yp4 yp4Var : yp4VarArr) {
            String a = yp4Var.a();
            int i = 0;
            for (yp4 yp4Var2 : yp4VarArr) {
                if (c16.i(yp4Var2.a(), a)) {
                    i++;
                }
            }
            if (i != 1) {
                ArrayList arrayList = new ArrayList();
                for (yp4 yp4Var3 : yp4VarArr) {
                    if (c16.i(yp4Var3.a(), a)) {
                        arrayList.add(yp4Var3);
                    }
                }
                mv5.a("'" + a + "' must be unique. Actual [" + arrayList + "]");
            }
        }
        this.a = b00.D0(yp4VarArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bq4)) {
            return false;
        }
        if (c16.i(this.a, ((bq4) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Settings(settings=" + this.a + ")";
    }
}
