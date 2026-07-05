package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.vbook.android.R;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: aib  reason: default package */
/* loaded from: classes3.dex */
public final class aib {
    public final lba a = mba.a;
    public final qna b = qna.a;
    public final ue6 c = ue6.c;

    public static Object d(aib aibVar, Context context, int i, n42 n42Var) {
        aibVar.getClass();
        AtomicBoolean atomicBoolean = tic.a;
        if (Build.VERSION.SDK_INT >= 29 && tic.a.get()) {
            uic.a.a("GlanceAppWidget::update", 0);
        }
        Object a = aibVar.a.a(new l(context, new ux(i), aibVar, (m42) null, 27), n42Var);
        if (a == n82.a) {
            return a;
        }
        return pvc.a;
    }

    public final void a(whb whbVar, long j, rv4 rv4Var, int i) {
        int i2;
        int i3;
        boolean z;
        String str;
        ComponentName componentName;
        rv4Var.g0(588508205);
        if (rv4Var.f(whbVar)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2;
        if (rv4Var.e(j)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        boolean z2 = true;
        if ((i5 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i5 & 1, z)) {
            if ((i5 & Token.ASSIGN_MOD) != 32) {
                z2 = false;
            }
            Object P = rv4Var.P();
            if (z2 || P == ax1.a) {
                P = new lid(j);
                rv4Var.o0(P);
            }
            lid lidVar = (lid) P;
            Context context = (Context) rv4Var.j(by1.b);
            String string = context.getString(R.string.tts_widget_name);
            string.getClass();
            String str2 = whbVar.b;
            if (str2.length() == 0) {
                str = string;
            } else {
                str = str2;
            }
            String str3 = whbVar.c;
            boolean z3 = whbVar.d;
            String str4 = whbVar.e;
            tza tzaVar = by1.e;
            rq9 rq9Var = ((tm3) rv4Var.j(tzaVar)).s;
            rq9 rq9Var2 = ((tm3) rv4Var.j(tzaVar)).t;
            vy4 vy4Var = vy4.a;
            xy4 r = s9e.r(vy4Var);
            String str5 = whbVar.a;
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage != null) {
                componentName = launchIntentForPackage.getComponent();
            } else {
                componentName = null;
            }
            Intent intent = new Intent("android.intent.action.VIEW");
            if (componentName != null) {
                intent.setComponent(componentName);
            } else {
                intent.setPackage(context.getPackageName()).getClass();
            }
            if (str5.length() > 0) {
                Uri parse = Uri.parse("vbookapp://view?screen=read&id=".concat(str5));
                parse.getClass();
                intent.setData(parse);
            }
            intent.addFlags(805306368);
            w92.b(s9e.r(vy4Var), null, jce.E(1949143947, new yhb(lidVar, r.d(new o5(new lya(intent, jce.z((q5[]) Arrays.copyOf(new q5[0], 0))))), rq9Var, str4, z3, str, str3, rq9Var2), rv4Var), rv4Var, 384, 2);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new xhb(this, whbVar, j, i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0075, code lost:
        if (r7.a.a(r1, r0) == r4) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ff A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(android.content.Context r8, int r9, defpackage.n42 r10) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aib.b(android.content.Context, int, n42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.n42 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.zhb
            if (r0 == 0) goto L13
            r0 = r5
            zhb r0 = (defpackage.zhb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            zhb r0 = new zhb
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 == r2) goto L27
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            return
        L27:
            gt1 r4 = defpackage.a82.e(r5)
            throw r4
        L2c:
            defpackage.hre.r(r5)
            el7 r5 = new el7
            r1 = 23
            r5.<init>(r4, r1)
            tu1 r4 = new tu1
            r1 = -666107586(0xffffffffd84c013e, float:-8.972228E14)
            r4.<init>(r5, r2, r1)
            r0.c = r2
            defpackage.ape.s(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aib.c(n42):void");
    }
}
