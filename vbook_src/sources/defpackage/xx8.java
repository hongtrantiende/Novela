package defpackage;

import android.app.RemoteAction;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.os.LocaleList;
import android.text.TextUtils;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xx8  reason: default package */
/* loaded from: classes.dex */
public final class xx8 implements sx8 {
    public final d82 a;
    public final Context b;
    public final e6a c;
    public final ov6 d;
    public TextClassifier f;
    public final sw7 e = new sw7();
    public final hm8 g = yae.z(null);
    public final Object h = new Object();

    public xx8(d82 d82Var, Context context, e6a e6aVar, ov6 ov6Var) {
        this.a = d82Var;
        this.b = context;
        this.c = e6aVar;
        this.d = ov6Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x007d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v3, types: [qw7] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.xx8 r16, java.lang.CharSequence r17, long r18, android.view.textclassifier.TextClassifier r20, defpackage.n42 r21) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xx8.a(xx8, java.lang.CharSequence, long, android.view.textclassifier.TextClassifier, n42):java.lang.Object");
    }

    public final void b(lob lobVar, CharSequence charSequence, long j, xt4 xt4Var) {
        sw7 sw7Var = this.e;
        enb enbVar = null;
        if (sw7Var.f()) {
            enb enbVar2 = (enb) this.g.getValue();
            enbVar2 = (enbVar2 != null && fxb.c(j, enbVar2.b) && c16.i(charSequence, enbVar2.a)) ? null : null;
            sw7Var.q(null);
            enbVar = enbVar2;
        }
        if (enbVar == null) {
            xt4Var.invoke(lobVar);
            return;
        }
        ArrayList arrayList = enbVar.d;
        TextClassification textClassification = enbVar.c;
        boolean isEmpty = textClassification.getActions().isEmpty();
        Object obj = this.h;
        if (!isEmpty) {
            lobVar.a.a(new cpb(obj, textClassification, 0, (Drawable) arrayList.get(0)));
        } else if ((textClassification.getIcon() != null || !TextUtils.isEmpty(textClassification.getLabel())) && (textClassification.getIntent() != null || textClassification.getOnClickListener() != null)) {
            lobVar.a.a(new cpb(obj, textClassification, -1, textClassification.getIcon()));
        }
        xt4Var.invoke(lobVar);
        List<RemoteAction> actions = textClassification.getActions();
        int size = actions.size();
        for (int i = 0; i < size; i++) {
            cp8.a(actions.get(i));
            if (i > 0) {
                lobVar.a.a(new cpb(obj, textClassification, i, (Drawable) arrayList.get(i)));
            }
        }
    }

    public final enb c(CharSequence charSequence, long j, TextClassification textClassification) {
        Icon icon;
        int size = textClassification.getActions().size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            RemoteAction remoteAction = textClassification.getActions().get(i);
            RemoteAction a = cp8.a(remoteAction);
            Drawable drawable = null;
            if (i != 0 && !a.shouldShowIcon()) {
                remoteAction = null;
            }
            RemoteAction a2 = cp8.a(remoteAction);
            if (a2 != null && (icon = a2.getIcon()) != null) {
                drawable = icon.loadDrawable(this.b);
            }
            arrayList.add(drawable);
        }
        return new enb(charSequence, j, textClassification, arrayList);
    }

    public final LocaleList d() {
        ov6 ov6Var = this.d;
        if (ov6Var != null) {
            ArrayList arrayList = new ArrayList(tl1.s(ov6Var, 10));
            for (nv6 nv6Var : ov6Var.a) {
                arrayList.add(nv6Var.a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            return new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
        }
        return new LocaleList(gx8.a.z().a().a);
    }

    public final Object e(CharSequence charSequence, long j, aab aabVar) {
        if (charSequence.length() == 0 || fxb.d(j)) {
            return pvc.a;
        }
        return z87.E(this.a, new vx8(this, new ux8(j, null, this, charSequence), null), aabVar);
    }

    public final Object f(CharSequence charSequence, long j, aab aabVar) {
        if (charSequence.length() == 0 || fxb.d(j)) {
            return null;
        }
        return z87.E(this.a, new vx8(this, new wx8(j, null, this, charSequence), null), aabVar);
    }
}
