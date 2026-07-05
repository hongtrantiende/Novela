package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fz0  reason: default package */
/* loaded from: classes3.dex */
public final class fz0 {
    public final ArrayList a;

    public fz0(int i) {
        switch (i) {
            case 2:
                this.a = new ArrayList();
                return;
            case 3:
                this.a = new ArrayList();
                return;
            default:
                this.a = new ArrayList();
                return;
        }
    }

    public int a(int i) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            jv8 jv8Var = (jv8) obj;
            int i3 = jv8Var.a;
            if (i < jv8Var.b && i3 <= i) {
                return ((i - i3) * jv8Var.d) + jv8Var.c;
            }
        }
        return -1;
    }

    public fz0(String str, ArrayList arrayList) {
        this.a = arrayList;
    }
}
