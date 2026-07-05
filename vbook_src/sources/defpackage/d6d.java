package defpackage;

import android.os.Build;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: d6d  reason: default package */
/* loaded from: classes3.dex */
public abstract class d6d {
    static {
        new mfb(new tvc(26));
        new mfb(new tvc(27));
        new mfb(new tvc(20));
        new mfb(new tvc(21));
        new mfb(new tvc(22));
        new mfb(new tvc(23));
        new mfb(new tvc(24));
        new mfb(new tvc(25));
    }

    public static final j6d a(xt4 xt4Var) {
        return new yh(new u0c(15, xt4Var)).k();
    }

    public static j6d b(String str) {
        str.getClass();
        if (Build.VERSION.SDK_INT >= 26) {
            return new yh0().k().b(str);
        }
        return new yh0().k().b(str);
    }
}
