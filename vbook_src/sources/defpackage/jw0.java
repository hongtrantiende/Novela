package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jw0  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class jw0 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yya b;

    public /* synthetic */ jw0(yya yyaVar, int i) {
        this.a = i;
        this.b = yyaVar;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i = this.a;
        boolean z = true;
        int i2 = 0;
        yya yyaVar = this.b;
        switch (i) {
            case 0:
                return Float.valueOf(((Number) yyaVar.getValue()).floatValue() / 100.0f);
            case 1:
                return Float.valueOf(((Number) yyaVar.getValue()).floatValue() / 100.0f);
            case 2:
                return ((zc6) yyaVar.getValue()).e;
            case 3:
                return Boolean.valueOf(((zc6) yyaVar.getValue()).j());
            case 4:
                return (List) ((zc6) yyaVar.getValue()).n.getValue();
            case 5:
                return Float.valueOf(((zc6) yyaVar.getValue()).h);
            case 6:
                return Float.valueOf(((zc6) yyaVar.getValue()).f());
            case 7:
                return Float.valueOf(((zc6) yyaVar.getValue()).g());
            case 8:
                return Integer.valueOf(((List) yyaVar.getValue()).size());
            case 9:
                return ((zc6) yyaVar.getValue()).e;
            case 10:
                return Boolean.valueOf(((zc6) yyaVar.getValue()).j());
            case 11:
                return Float.valueOf(((zc6) yyaVar.getValue()).i);
            case 12:
                return Float.valueOf(((zc6) yyaVar.getValue()).j.a);
            case 13:
                return Float.valueOf(((zc6) yyaVar.getValue()).j.b);
            case 14:
                return (vt5) yyaVar.getValue();
            case 15:
                return (sp6) yyaVar.getValue();
            case 16:
                if (!((l84) yyaVar.getValue()).h.isEmpty()) {
                    i2 = ((l84) yyaVar.getValue()).e.size() + ((l84) yyaVar.getValue()).g.size() + ((l84) yyaVar.getValue()).c.size() + (!((l84) yyaVar.getValue()).b ? 1 : 0);
                }
                return Integer.valueOf(i2);
            case 17:
                if (!(((m10) yyaVar.getValue()) instanceof i10) && !(((m10) yyaVar.getValue()) instanceof k10)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 18:
                return Boolean.valueOf(((m10) yyaVar.getValue()) instanceof j10);
            case 19:
                return Integer.valueOf(((Number) yyaVar.getValue()).intValue());
            case 20:
                return Float.valueOf(((Number) yyaVar.getValue()).floatValue());
            case 21:
                return Float.valueOf(((Number) yyaVar.getValue()).floatValue());
            case 22:
                return Integer.valueOf(((Number) yyaVar.getValue()).intValue());
            case 23:
                return Float.valueOf(((Number) yyaVar.getValue()).floatValue());
            case 24:
                return Float.valueOf(((Number) yyaVar.getValue()).floatValue());
            case 25:
                Boolean bool = (Boolean) yyaVar.getValue();
                bool.getClass();
                return bool;
            case 26:
                Boolean bool2 = (Boolean) yyaVar.getValue();
                bool2.getClass();
                return bool2;
            case 27:
                Boolean bool3 = (Boolean) yyaVar.getValue();
                bool3.getClass();
                return bool3;
            case 28:
                Boolean bool4 = (Boolean) yyaVar.getValue();
                bool4.getClass();
                return bool4;
            default:
                return Integer.valueOf(((Number) yyaVar.getValue()).intValue());
        }
    }
}
