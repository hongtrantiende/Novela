package defpackage;

import android.util.Log;
import java.util.HashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ow6  reason: default package */
/* loaded from: classes.dex */
public final class ow6 {
    public static lw6 e;
    public final String a;
    public lw6 b;
    public static final Object c = new Object();
    public static final HashMap d = new HashMap();
    public static final ox9 f = ox9.f;

    public ow6(String str) {
        this.a = str;
    }

    public final void a(lw6 lw6Var, String str) {
        f.getClass();
        if (lw6Var == lw6.NONE) {
            return;
        }
        int i = 6;
        switch (lw6Var.ordinal()) {
            case 0:
            case 6:
                i = 2;
                break;
            case 1:
            case 2:
                break;
            case 3:
                i = 5;
                break;
            case 4:
                i = 4;
                break;
            case 5:
                i = 3;
                break;
            default:
                xk5.o();
                return;
        }
        Log.println(i, this.a, str);
    }
}
