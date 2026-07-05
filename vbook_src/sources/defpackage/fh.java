package defpackage;

import android.os.Bundle;
import android.os.Looper;
import android.view.Choreographer;
import java.util.UUID;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fh  reason: default package */
/* loaded from: classes.dex */
public final class fh extends fb6 implements vt4 {
    public final /* synthetic */ int a;
    public static final fh b = new fh(0, 0);
    public static final fh c = new fh(0, 1);
    public static final fh d = new fh(0, 2);
    public static final fh e = new fh(0, 3);
    public static final fh f = new fh(0, 4);
    public static final fh C = new fh(0, 5);
    public static final fh D = new fh(0, 6);
    public static final fh E = new fh(0, 7);
    public static final fh F = new fh(0, 8);
    public static final fh G = new fh(0, 9);
    public static final fh H = new fh(0, 10);
    public static final fh I = new fh(0, 11);
    public static final fh J = new fh(0, 12);
    public static final fh K = new fh(0, 13);
    public static final fh L = new fh(0, 14);
    public static final fh M = new fh(0, 15);
    public static final fh N = new fh(0, 16);
    public static final fh O = new fh(0, 17);
    public static final fh P = new fh(0, 18);
    public static final fh Q = new fh(0, 19);
    public static final fh R = new fh(0, 20);
    public static final fh S = new fh(0, 21);
    public static final fh T = new fh(0, 22);
    public static final fh U = new fh(0, 23);
    public static final fh V = new fh(0, 24);
    public static final fh W = new fh(0, 25);
    public static final fh X = new fh(0, 26);
    public static final fh Y = new fh(0, 27);
    public static final fh Z = new fh(0, 28);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fh(int i, int i2) {
        super(i);
        this.a = i2;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        Choreographer choreographer;
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                gh.a("LocalConfiguration");
                throw null;
            case 1:
                gh.a("LocalContext");
                throw null;
            case 2:
                gh.a("LocalImageVectorCache");
                throw null;
            case 3:
                gh.a("LocalResourceIdCache");
                throw null;
            case 4:
                gh.a("LocalView");
                throw null;
            case 5:
                return UUID.randomUUID();
            case 6:
                return Boolean.FALSE;
            case 7:
                return "DEFAULT_TEST_TAG";
            case 8:
                return UUID.randomUUID();
            case 9:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    choreographer = Choreographer.getInstance();
                } else {
                    sw2 sw2Var = ab3.a;
                    choreographer = (Choreographer) z87.C(zz6.a, new qo(2, 0, null));
                }
                to toVar = new to(choreographer, cqe.f(Looper.getMainLooper()));
                return nq2.C(toVar, toVar.H);
            case 10:
            case 11:
            case 12:
                return pvcVar;
            case 13:
                return null;
            case 14:
                return new od6(2);
            case 15:
                return null;
            case 16:
                return new Bundle();
            case 17:
                return null;
            case 18:
                dy1.b("LocalAutofillManager");
                throw null;
            case 19:
                dy1.b("LocalAutofillTree");
                throw null;
            case 20:
                dy1.b("LocalClipboard");
                throw null;
            case 21:
                dy1.b("LocalClipboardManager");
                throw null;
            case 22:
                return tm3.B;
            case 23:
                throw new IllegalStateException("No default context");
            case 24:
                return Boolean.TRUE;
            case 25:
                dy1.b("LocalDensity");
                throw null;
            case 26:
                dy1.b("LocalFocusManager");
                throw null;
            case 27:
                dy1.b("LocalFontFamilyResolver");
                throw null;
            default:
                dy1.b("LocalFontLoader");
                throw null;
        }
    }
}
