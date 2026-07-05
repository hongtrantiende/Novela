package defpackage;

import android.graphics.Bitmap;
import android.graphics.pdf.models.selection.PageSelection;
import android.graphics.pdf.models.selection.SelectionBoundary;
import android.os.IInterface;
import android.os.ParcelFileDescriptor;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fp8  reason: default package */
/* loaded from: classes.dex */
public interface fp8 extends IInterface {
    public static final String k = "androidx$pdf$PdfDocumentRemote".replace('$', '.');

    Bitmap A(int i, int i2, int i3, yn9 yn9Var);

    void E();

    b73 F(int i);

    Bitmap K(int i, int i2, int i3, int i4, int i5, int i6, int i7, yn9 yn9Var);

    void M(int i);

    int h();

    int i();

    PageSelection m(int i, SelectionBoundary selectionBoundary, SelectionBoundary selectionBoundary2);

    int s();

    int x(ParcelFileDescriptor parcelFileDescriptor, String str);
}
