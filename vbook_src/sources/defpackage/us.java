package defpackage;

import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.pdf.component.HighlightAnnotation;
import android.graphics.pdf.component.PdfPageObject;
import android.graphics.pdf.component.PdfPagePathObject;
import android.graphics.pdf.component.StampAnnotation;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: us  reason: default package */
/* loaded from: classes.dex */
public final class us implements w62 {
    public final /* synthetic */ int a;

    public /* synthetic */ us(int i) {
        this.a = i;
    }

    @Override // defpackage.w62
    public final Object a(Object obj, Object[] objArr) {
        int i;
        switch (this.a) {
            case 0:
                HighlightAnnotation highlightAnnotation = (HighlightAnnotation) obj;
                if (objArr.length != 0) {
                    Object obj2 = objArr[0];
                    if (obj2 instanceof Integer) {
                        int intValue = ((Integer) obj2).intValue();
                        List boundsList = highlightAnnotation.getBoundsList();
                        boundsList.getClass();
                        return new d65(intValue, boundsList, highlightAnnotation.getColor());
                    }
                }
                vs.m("First parameter is required to be pagenum.");
                return null;
            case 1:
                PdfPagePathObject pdfPagePathObject = (PdfPagePathObject) obj;
                Path path = pdfPagePathObject.toPath();
                path.getClass();
                ArrayList arrayList = new ArrayList();
                float[] approximate = path.approximate(0.5f);
                approximate.getClass();
                ry5 D = dce.D(dce.F(0, approximate.length), 3);
                int i2 = D.a;
                int i3 = D.b;
                int i4 = D.c;
                if ((i4 > 0 && i2 <= i3) || (i4 < 0 && i3 <= i2)) {
                    while (true) {
                        if (i2 != 0 && approximate[i2] != approximate[i2 - 3]) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                        arrayList.add(new ho8(approximate[i2 + 1], approximate[i2 + 2], i));
                        if (i2 != i3) {
                            i2 += i4;
                        }
                    }
                }
                return new io8(pdfPagePathObject.getFillColor(), pdfPagePathObject.getStrokeWidth(), arrayList);
            case 2:
                StampAnnotation stampAnnotation = (StampAnnotation) obj;
                if (objArr.length != 0 && (objArr[0] instanceof Integer)) {
                    ArrayList arrayList2 = new ArrayList();
                    for (PdfPageObject pdfPageObject : stampAnnotation.getObjects()) {
                        pdfPageObject.getClass();
                        if (pdfPageObject instanceof PdfPagePathObject) {
                            arrayList2.add((zp8) xoe.e.a(pdfPageObject, new Object[0]));
                        } else {
                            cy7.j(pdfPageObject.getClass().getSimpleName(), "PdfPageObject :: ");
                            return null;
                        }
                    }
                    Object obj3 = objArr[0];
                    obj3.getClass();
                    int intValue2 = ((Integer) obj3).intValue();
                    RectF bounds = stampAnnotation.getBounds();
                    bounds.getClass();
                    return new hya(intValue2, bounds, arrayList2);
                }
                vs.m("First parameter is required to be pagenum.");
                return null;
            case 3:
                d65 d65Var = (d65) obj;
                HighlightAnnotation highlightAnnotation2 = new HighlightAnnotation(d65Var.b);
                highlightAnnotation2.setColor(d65Var.c);
                return highlightAnnotation2;
            case 4:
                io8 io8Var = (io8) obj;
                ArrayList arrayList3 = io8Var.c;
                Path path2 = new Path();
                int size = arrayList3.size();
                int i5 = 0;
                while (i5 < size) {
                    Object obj4 = arrayList3.get(i5);
                    i5++;
                    ho8 ho8Var = (ho8) obj4;
                    int i6 = ho8Var.c;
                    float f = ho8Var.b;
                    float f2 = ho8Var.a;
                    if (i6 == 0) {
                        path2.moveTo(f2, f);
                    } else if (i6 == 1) {
                        path2.lineTo(f2, f);
                    }
                }
                PdfPagePathObject pdfPagePathObject2 = new PdfPagePathObject(path2);
                pdfPagePathObject2.setStrokeWidth(io8Var.b);
                pdfPagePathObject2.setFillColor(io8Var.a);
                pdfPagePathObject2.setRenderMode(0);
                return pdfPagePathObject2;
            default:
                hya hyaVar = (hya) obj;
                StampAnnotation stampAnnotation2 = new StampAnnotation(hyaVar.b);
                ArrayList arrayList4 = hyaVar.c;
                int size2 = arrayList4.size();
                int i7 = 0;
                while (i7 < size2) {
                    Object obj5 = arrayList4.get(i7);
                    i7++;
                    zp8 zp8Var = (zp8) obj5;
                    zp8Var.getClass();
                    if (zp8Var instanceof io8) {
                        io8 io8Var2 = (io8) zp8Var;
                        ArrayList arrayList5 = io8Var2.c;
                        Path path3 = new Path();
                        int size3 = arrayList5.size();
                        int i8 = 0;
                        while (i8 < size3) {
                            Object obj6 = arrayList5.get(i8);
                            i8++;
                            ho8 ho8Var2 = (ho8) obj6;
                            int i9 = ho8Var2.c;
                            float f3 = ho8Var2.b;
                            float f4 = ho8Var2.a;
                            if (i9 == 0) {
                                path3.moveTo(f4, f3);
                            } else if (i9 == 1) {
                                path3.lineTo(f4, f3);
                            }
                        }
                        PdfPagePathObject pdfPagePathObject3 = new PdfPagePathObject(path3);
                        pdfPagePathObject3.setStrokeWidth(io8Var2.b);
                        pdfPagePathObject3.setFillColor(io8Var2.a);
                        pdfPagePathObject3.setRenderMode(0);
                        stampAnnotation2.addObject(pdfPagePathObject3);
                    } else {
                        cy7.j(zp8Var.getClass().getSimpleName(), "PdfObject :: ");
                        return null;
                    }
                }
                return stampAnnotation2;
        }
    }
}
