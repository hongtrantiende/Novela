package defpackage;

import android.content.Context;
import android.webkit.WebView;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ohd  reason: default package */
/* loaded from: classes.dex */
public final class ohd extends FrameLayout implements r8b {
    public final q61 a;
    public final mhd b;
    public List c;
    public r61 d;
    public float e;
    public float f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [mhd, android.view.View, android.webkit.WebView] */
    public ohd(Context context) {
        super(context, null);
        this.c = Collections.EMPTY_LIST;
        this.d = r61.g;
        this.e = 0.0533f;
        this.f = 0.08f;
        q61 q61Var = new q61(context, 0);
        this.a = q61Var;
        ?? webView = new WebView(context, null);
        this.b = webView;
        webView.setBackgroundColor(0);
        webView.getSettings().setAllowContentAccess(false);
        addView(q61Var);
        addView(webView);
    }

    @Override // defpackage.r8b
    public final void a(List list, r61 r61Var, float f, float f2) {
        this.d = r61Var;
        this.e = f;
        this.f = f2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            td2 td2Var = (td2) list.get(i);
            if (td2Var.d != null) {
                arrayList.add(td2Var);
            } else {
                arrayList2.add(td2Var);
            }
        }
        if (!this.c.isEmpty() || !arrayList2.isEmpty()) {
            this.c = arrayList2;
            c();
        }
        this.a.a(arrayList, r61Var, f, f2);
        invalidate();
    }

    public final String b(int i, float f) {
        float n = hse.n(i, f, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        if (n == -3.4028235E38f) {
            return "unset";
        }
        String str = a2d.a;
        return String.format(Locale.US, "%.2fpx", Float.valueOf(n / getContext().getResources().getDisplayMetrics().density));
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x01f0, code lost:
        if (r25 != 0) goto L262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01f3, code lost:
        r10 = "left";
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01f4, code lost:
        r27 = r10;
        r25 = "top";
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01f9, code lost:
        if (r25 != 0) goto L261;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x05ca  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0606  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x062b  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0648  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x067a  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0523 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 1773
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ohd.c():void");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z && !this.c.isEmpty()) {
            c();
        }
    }
}
