package defpackage;

import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rm  reason: default package */
/* loaded from: classes.dex */
public final class rm {
    public final Window a;
    public boolean b;
    public bp9 c;
    public final mfb d = new mfb(new ve(this, 6));

    public rm(Window window) {
        this.a = window;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01b8 A[Catch: all -> 0x020d, TryCatch #2 {all -> 0x020d, blocks: (B:74:0x016e, B:76:0x0177, B:78:0x0198, B:81:0x01a6, B:83:0x01aa, B:85:0x01b0, B:87:0x01b8, B:89:0x01dd, B:90:0x01df, B:92:0x01eb, B:95:0x01f1), top: B:141:0x016e }] */
    /* JADX WARN: Type inference failed for: r0v17, types: [zo0, zb4] */
    /* JADX WARN: Type inference failed for: r14v9, types: [zo0, zb4] */
    /* JADX WARN: Type inference failed for: r2v12, types: [zo0, zb4] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.qm r14, defpackage.pm r15) {
        /*
            Method dump skipped, instructions count: 725
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rm.a(qm, pm):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v5, types: [android.view.ViewGroup] */
    public final void b(sw1 sw1Var) {
        Object gs9Var;
        String str;
        String message;
        sw1 sw1Var2 = sw1Var;
        if (this.b) {
            return;
        }
        if (sw1Var == null) {
            try {
                gs9Var = (ViewGroup) this.a.findViewById(16908290);
            } catch (Throwable th) {
                gs9Var = new gs9(th);
            }
            Throwable a = hs9.a(gs9Var);
            if (a != null) {
                if (jy.a()) {
                    kw6 kw6Var = kw6.b;
                    iea ieaVar = iea.e;
                    if (kw6Var.a.a.compareTo(ieaVar) <= 0) {
                        kw6Var.a(ieaVar, "Log", "Failed to get the rootView from android.R.id.content.", null);
                    }
                }
            } else {
                a = null;
            }
            if (gs9Var instanceof gs9) {
                gs9Var = null;
            }
            ?? r7 = (ViewGroup) gs9Var;
            sw1Var2 = r7;
            if (r7 == 0) {
                if (a != null && (message = a.getMessage()) != null) {
                    str = "\nCaused by: ".concat(message);
                } else {
                    str = "";
                }
                cy7.a("The root view is not available at this stage, please set the rootView parameter manually and init the SystemBarsController in Activity's onCreate method.".concat(str));
                return;
            }
        }
        if (sw1Var2.getParent() != null) {
            this.b = true;
            this.c = new bp9(this.a, sw1Var2);
            mfb mfbVar = ap.a;
            if (((Number) mfbVar.getValue()).intValue() >= 29) {
                this.a.isStatusBarContrastEnforced();
                this.a.isNavigationBarContrastEnforced();
                this.a.setStatusBarContrastEnforced(false);
                this.a.setNavigationBarContrastEnforced(false);
            }
            if (((Number) mfbVar.getValue()).intValue() >= 28) {
                this.a.getNavigationBarDividerColor();
                this.a.getAttributes();
                Window window = this.a;
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.getClass();
                attributes.layoutInDisplayCutoutMode = 1;
                window.setAttributes(attributes);
                this.a.setNavigationBarDividerColor(0);
            }
            this.a.getStatusBarColor();
            this.a.getNavigationBarColor();
            bp9 bp9Var = this.c;
            if (bp9Var != null) {
                ((kwe) bp9Var.b).K();
            }
            bp9 bp9Var2 = this.c;
            if (bp9Var2 != null) {
                ((kwe) bp9Var2.b).J();
            }
            cwe.s(this.a, false);
            c(om.b);
            pm pmVar = pm.c;
            a(qm.b, pmVar);
            a(qm.c, pmVar);
            return;
        }
        hfd.h(sw1Var2, " must have a parent.", "The rootView ");
    }

    public final void c(om omVar) {
        bp9 bp9Var = this.c;
        if (bp9Var != null) {
            int ordinal = omVar.ordinal();
            int i = 1;
            if (ordinal != 0) {
                if (ordinal == 1) {
                    i = 2;
                } else {
                    xk5.o();
                    return;
                }
            }
            ((kwe) bp9Var.b).P(i);
        }
    }
}
