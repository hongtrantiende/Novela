package defpackage;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.pdf.component.PdfAnnotation;
import android.graphics.pdf.models.FormEditRecord;
import android.graphics.pdf.models.selection.PageSelection;
import android.graphics.pdf.models.selection.SelectionBoundary;
import android.util.Pair;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kq8  reason: default package */
/* loaded from: classes.dex */
public interface kq8 extends AutoCloseable {
    int A0(PdfAnnotation pdfAnnotation);

    Pair D(PointF pointF, int[] iArr);

    List G0(FormEditRecord formEditRecord);

    PageSelection O0(SelectionBoundary selectionBoundary, SelectionBoundary selectionBoundary2);

    List R();

    List X();

    List X0(int[] iArr);

    void Y(Bitmap bitmap, int i, int i2, int i3, int i4, yn9 yn9Var);

    List Y0();

    boolean Z(int i, PdfAnnotation pdfAnnotation);

    int d();

    void d1(int i);

    int e();

    List e0();

    List j1();

    List r0();

    void v0(Bitmap bitmap, yn9 yn9Var);

    List y(String str);
}
