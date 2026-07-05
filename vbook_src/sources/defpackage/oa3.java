package defpackage;

import java.io.IOException;
import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: oa3  reason: default package */
/* loaded from: classes.dex */
public final class oa3 {
    public final String a;
    public final long[] b = new long[2];
    public final ArrayList c = new ArrayList(2);
    public final ArrayList d = new ArrayList(2);
    public boolean e;
    public boolean f;
    public o40 g;
    public int h;
    public final /* synthetic */ ra3 i;

    public oa3(ra3 ra3Var, String str) {
        this.i = ra3Var;
        this.a = str;
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i = 0; i < 2; i++) {
            sb.append(i);
            this.c.add(this.i.a.e(sb.toString()));
            sb.append(".tmp");
            this.d.add(this.i.a.e(sb.toString()));
            sb.setLength(length);
        }
    }

    public final pa3 a() {
        if (!this.e || this.g != null || this.f) {
            return null;
        }
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            ra3 ra3Var = this.i;
            if (i < size) {
                if (!ra3Var.M.j0((hn8) arrayList.get(i))) {
                    try {
                        ra3Var.m0(this);
                    } catch (IOException unused) {
                    }
                    return null;
                }
                i++;
            } else {
                this.h++;
                return new pa3(ra3Var, this);
            }
        }
    }
}
