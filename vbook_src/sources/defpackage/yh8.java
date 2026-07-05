package defpackage;

import android.graphics.pdf.component.HighlightAnnotation;
import android.graphics.pdf.component.PdfAnnotation;
import android.graphics.pdf.component.StampAnnotation;
import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yh8  reason: default package */
/* loaded from: classes.dex */
public final class yh8 {
    public final ip8 a;

    public yh8(ip8 ip8Var, int i) {
        ip8Var.getClass();
        switch (i) {
            case 1:
                this.a = ip8Var;
                return;
            default:
                this.a = ip8Var;
                return;
        }
    }

    public static ArrayList a(int i, kq8 kq8Var) {
        us usVar;
        kq8Var.getClass();
        List<Pair> Y0 = kq8Var.Y0();
        ArrayList arrayList = new ArrayList(tl1.s(Y0, 10));
        for (Pair pair : Y0) {
            String valueOf = String.valueOf(pair.first);
            PdfAnnotation pdfAnnotation = (PdfAnnotation) pair.second;
            pdfAnnotation.getClass();
            if (pdfAnnotation instanceof StampAnnotation) {
                usVar = voe.i;
            } else if (pdfAnnotation instanceof HighlightAnnotation) {
                usVar = voe.j;
            } else {
                cy7.j(pdfAnnotation.getClass().getSimpleName(), "PdfAnnotation :: ");
                return null;
            }
            arrayList.add(new b96(valueOf, (uo8) usVar.a(pdfAnnotation, Integer.valueOf(i))));
        }
        return arrayList;
    }

    public static String b(kq8 kq8Var, wg3 wg3Var) {
        us usVar = voe.k;
        us usVar2 = voe.h;
        if (wg3Var instanceof zw5) {
            uo8 uo8Var = ((zw5) wg3Var).a;
            if (uo8Var instanceof hya) {
                usVar = usVar2;
            } else if (!(uo8Var instanceof d65)) {
                cy7.j(uo8Var.getClass().getSimpleName(), "PdfAnnotation :: ");
                return null;
            }
            return String.valueOf(kq8Var.A0((PdfAnnotation) usVar.a(uo8Var, new Object[0])));
        } else if (wg3Var instanceof uxc) {
            uxc uxcVar = (uxc) wg3Var;
            String str = uxcVar.a;
            uo8 uo8Var2 = uxcVar.b;
            if (uo8Var2 instanceof hya) {
                usVar = usVar2;
            } else if (!(uo8Var2 instanceof d65)) {
                cy7.j(uo8Var2.getClass().getSimpleName(), "PdfAnnotation :: ");
                return null;
            }
            if (kq8Var.Z(Integer.parseInt(str), (PdfAnnotation) usVar.a(uo8Var2, new Object[0]))) {
                return str;
            }
            vs.k("Failed to update annotation");
            return null;
        } else if (wg3Var instanceof un9) {
            String str2 = ((un9) wg3Var).a;
            kq8Var.d1(Integer.parseInt(str2));
            return str2;
        } else {
            xk5.q("Unsupported operation: ".concat(wg3Var.getClass().getSimpleName()));
            return null;
        }
    }
}
