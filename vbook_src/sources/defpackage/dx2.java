package defpackage;

import java.util.Locale;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dx2  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class dx2 {
    public final /* synthetic */ int a;

    public /* synthetic */ dx2(int i) {
        this.a = i;
    }

    public final sc5 a(tva tvaVar) {
        switch (this.a) {
            case 0:
                ((hva) tvaVar).getClass();
                return new sc5("<strong>", "</strong>");
            case 1:
                sva svaVar = (sva) tvaVar;
                svaVar.getClass();
                return new sc5(hl5.n("<user name=\"", rse.f(svaVar.a), "\"/>"), "");
            case 2:
                nva nvaVar = (nva) tvaVar;
                nvaVar.getClass();
                return new sc5(hl5.n("<video src=\"", rse.f(nvaVar.a), "\"></video>"), "");
            case 3:
                kva kvaVar = (kva) tvaVar;
                kvaVar.getClass();
                return new sc5(hl5.n("<audio src=\"", rse.f(kvaVar.a), "\"></audio>"), "");
            case 4:
                iva ivaVar = (iva) tvaVar;
                ivaVar.getClass();
                nqe.u(16);
                String l = Long.toString(ivaVar.a & 16777215, 16);
                l.getClass();
                String upperCase = k4b.r0(6, l).toUpperCase(Locale.ROOT);
                upperCase.getClass();
                return new sc5("<span style=\"color:#" + upperCase + "\">", "</span>");
            case 5:
                ((ova) tvaVar).getClass();
                return new sc5("<em>", "</em>");
            case 6:
                ((rva) tvaVar).getClass();
                return new sc5("<u>", "</u>");
            case 7:
                ((qva) tvaVar).getClass();
                return new sc5("<s>", "</s>");
            case 8:
                ((lva) tvaVar).getClass();
                return new sc5("<code>", "</code>");
            case 9:
                pva pvaVar = (pva) tvaVar;
                pvaVar.getClass();
                return new sc5(hl5.n("<a href=\"", rse.f(pvaVar.a), "\" rel=\"noreferrer\">"), "</a>");
            case 10:
                jva jvaVar = (jva) tvaVar;
                jvaVar.getClass();
                nqe.u(16);
                String l2 = Long.toString(jvaVar.a & 4294967295L, 16);
                l2.getClass();
                String upperCase2 = k4b.r0(8, l2).toUpperCase(Locale.ROOT);
                upperCase2.getClass();
                return new sc5("<mark data-cascade-highlight=\"" + upperCase2 + "\">", "</mark>");
            default:
                mva mvaVar = (mva) tvaVar;
                mvaVar.getClass();
                return new sc5(hl5.n("<emoji src=\"", rse.f(mvaVar.a), "\">"), "</emoji>");
        }
    }
}
