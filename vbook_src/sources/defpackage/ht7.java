package defpackage;

import android.content.Context;
import android.graphics.Path;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.FrameLayout;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ht7  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ht7 implements xt4 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ht7(int i, int i2, lhd lhdVar) {
        this.b = i;
        this.c = i2;
        this.d = lhdVar;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.d;
        int i2 = this.c;
        int i3 = this.b;
        switch (i) {
            case 0:
                yj yjVar = (yj) obj2;
                ll8 ll8Var = (ll8) obj;
                tj tjVar = ll8Var.a;
                int d = ll8Var.d(i3);
                int d2 = ll8Var.d(i2);
                CharSequence charSequence = tjVar.e;
                if (d < 0 || d > d2 || d2 > charSequence.length()) {
                    int length = charSequence.length();
                    StringBuilder r = hl5.r(d, d2, "start(", ") or end(", ") is out of range [0..");
                    r.append(length);
                    r.append("], or start > end!");
                    mv5.a(r.toString());
                }
                Path path = new Path();
                dvb dvbVar = tjVar.d;
                dvbVar.f.getSelectionPath(d, d2, path);
                int i4 = dvbVar.h;
                if (i4 != 0 && !path.isEmpty()) {
                    path.offset(nae.e, i4);
                }
                yj yjVar2 = new yj(path);
                yjVar2.p((Float.floatToRawIntBits(nae.e) << 32) | (Float.floatToRawIntBits(ll8Var.f) & 4294967295L));
                yj.b(yjVar, yjVar2);
                return pvc.a;
            default:
                lhd lhdVar = (lhd) obj2;
                Context context = (Context) obj;
                context.getClass();
                FrameLayout frameLayout = new FrameLayout(context);
                pgd pgdVar = new pgd(context);
                lhdVar.a.setValue(pgdVar);
                ((WebView) pgdVar.d.a).getSettings().setJavaScriptEnabled(true);
                pgdVar.e = new g99(lhdVar, 13);
                Bundle bundle = lhdVar.i;
                WebView webView = pgdVar.a;
                if (bundle != null) {
                    webView.restoreState(bundle);
                }
                frameLayout.addView(webView, new FrameLayout.LayoutParams(i3, i2));
                return frameLayout;
        }
    }

    public /* synthetic */ ht7(yj yjVar, int i, int i2) {
        this.d = yjVar;
        this.b = i;
        this.c = i2;
    }
}
