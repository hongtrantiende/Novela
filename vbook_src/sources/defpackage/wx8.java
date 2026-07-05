package defpackage;

import android.os.Build;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import android.view.textclassifier.TextSelection;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wx8  reason: default package */
/* loaded from: classes.dex */
public final class wx8 extends aab implements lu4 {
    public final /* synthetic */ long C;
    public final /* synthetic */ xx8 D;
    public sw7 a;
    public xx8 b;
    public long c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ CharSequence f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wx8(long j, m42 m42Var, xx8 xx8Var, CharSequence charSequence) {
        super(2, m42Var);
        this.f = charSequence;
        this.C = j;
        this.D = xx8Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        wx8 wx8Var = new wx8(this.C, m42Var, this.D, this.f);
        wx8Var.e = obj;
        return wx8Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        return ((wx8) create(cp8.h(obj), (m42) obj2)).invokeSuspend(pvc.a);
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        long j;
        enb enbVar;
        xx8 xx8Var;
        sw7 sw7Var;
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    j = this.c;
                    hre.r(obj);
                } else {
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                j = this.c;
                xx8Var = this.b;
                sw7Var = this.a;
                enbVar = (enb) this.e;
                hre.r(obj);
                try {
                    xx8Var.g.setValue(enbVar);
                } finally {
                    sw7Var.q(null);
                }
            }
        } else {
            hre.r(obj);
            TextClassifier h = cp8.h(this.e);
            long j2 = this.C;
            int g = fxb.g(j2);
            int f = fxb.f(j2);
            CharSequence charSequence = this.f;
            TextSelection.Request.Builder builder = new TextSelection.Request.Builder(charSequence, g, f);
            xx8 xx8Var2 = this.D;
            TextSelection.Request.Builder defaultLocales = builder.setDefaultLocales(xx8Var2.d());
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 31) {
                defaultLocales.setIncludeTextClassification(true);
            }
            TextSelection suggestSelection = h.suggestSelection(defaultLocales.build());
            long a = sze.a(suggestSelection.getSelectionStartIndex(), suggestSelection.getSelectionEndIndex());
            n82 n82Var = n82.a;
            if (i2 >= 31 && suggestSelection.getTextClassification() != null) {
                TextClassification textClassification = suggestSelection.getTextClassification();
                textClassification.getClass();
                enb c = xx8Var2.c(charSequence, a, textClassification);
                sw7 sw7Var2 = xx8Var2.e;
                this.e = c;
                this.a = sw7Var2;
                this.b = xx8Var2;
                this.c = a;
                this.d = 1;
                if (sw7Var2.o(this) != n82Var) {
                    enbVar = c;
                    xx8Var = xx8Var2;
                    sw7Var = sw7Var2;
                    j = a;
                    xx8Var.g.setValue(enbVar);
                }
            } else {
                this.c = a;
                this.d = 2;
                if (xx8.a(xx8Var2, this.f, a, h, this) != n82Var) {
                    j = a;
                }
            }
            return n82Var;
        }
        return new fxb(j);
    }
}
