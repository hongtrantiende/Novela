package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: up3  reason: default package */
/* loaded from: classes.dex */
public abstract class up3 implements lp3 {
    public int a;
    public final ArrayList b;

    public up3(int i, int i2) {
        this.a = (i2 & 1) != 0 ? Integer.MAX_VALUE : i;
        this.b = new ArrayList();
    }

    public final String d() {
        return l4b.x(sl1.i0(this.b, ",\n", null, null, null, 62), "  ");
    }
}
