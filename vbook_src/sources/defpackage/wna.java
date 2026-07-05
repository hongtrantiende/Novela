package defpackage;

import android.os.Bundle;
import android.util.Size;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wna  reason: default package */
/* loaded from: classes.dex */
public final class wna implements s76 {
    public static final wna a = new Object();
    public static final q9a b = aze.m("android.util.Size", new o9a[0]);

    @Override // defpackage.s76
    public final void a(jbe jbeVar, Object obj) {
        Size size = (Size) obj;
        size.getClass();
        if (jbeVar instanceof jy9) {
            jy9 jy9Var = (jy9) jbeVar;
            Bundle bundle = jy9Var.C;
            String str = jy9Var.E;
            str.getClass();
            bundle.putSize(str, size);
            return;
        }
        p1a.k(am8.y(b.a, jbeVar));
    }

    @Override // defpackage.s76
    public final Object c(yq2 yq2Var) {
        if (yq2Var instanceof iy9) {
            iy9 iy9Var = (iy9) yq2Var;
            Bundle bundle = iy9Var.e;
            bundle.getClass();
            String str = iy9Var.g;
            str.getClass();
            Size size = bundle.getSize(str);
            if (size != null) {
                return size;
            }
            gwe.l(str);
            throw null;
        }
        p1a.k(am8.x(b.a, yq2Var));
        return null;
    }

    @Override // defpackage.s76
    public final o9a e() {
        return b;
    }
}
