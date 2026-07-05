package defpackage;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.pdf.PdfRenderer;
import android.graphics.pdf.component.PdfAnnotation;
import android.graphics.pdf.models.FormEditRecord;
import android.graphics.pdf.models.selection.PageSelection;
import android.graphics.pdf.models.selection.SelectionBoundary;
import android.util.Pair;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mq8  reason: default package */
/* loaded from: classes.dex */
public final class mq8 implements kq8 {
    public static final UnsupportedOperationException d = new UnsupportedOperationException("Operation supported above S + SDK extension >= 13");
    public static final UnsupportedOperationException e = new UnsupportedOperationException("Operation supported above S + SDK extension >= 18");
    public static final UnsupportedOperationException f = new UnsupportedOperationException("Operation supported above S + SDK extension >= 19");
    public final PdfRenderer.Page a;
    public final int b;
    public final int c;

    public mq8(PdfRenderer.Page page) {
        this.a = page;
        this.b = page.getHeight();
        this.c = page.getWidth();
    }

    @Override // defpackage.kq8
    public final int A0(PdfAnnotation pdfAnnotation) {
        pdfAnnotation.getClass();
        throw e;
    }

    @Override // defpackage.kq8
    public final Pair D(PointF pointF, int[] iArr) {
        throw f;
    }

    @Override // defpackage.kq8
    public final List G0(FormEditRecord formEditRecord) {
        throw e;
    }

    @Override // defpackage.kq8
    public final PageSelection O0(SelectionBoundary selectionBoundary, SelectionBoundary selectionBoundary2) {
        selectionBoundary.getClass();
        selectionBoundary2.getClass();
        throw d;
    }

    @Override // defpackage.kq8
    public final List R() {
        throw d;
    }

    @Override // defpackage.kq8
    public final List X() {
        throw d;
    }

    @Override // defpackage.kq8
    public final List X0(int[] iArr) {
        throw d;
    }

    @Override // defpackage.kq8
    public final void Y(Bitmap bitmap, int i, int i2, int i3, int i4, yn9 yn9Var) {
        yn9Var.getClass();
        this.a.render(bitmap, null, jqe.s(i, i2, i3, i4, this.c, this.b), 1);
    }

    @Override // defpackage.kq8
    public final List Y0() {
        throw e;
    }

    @Override // defpackage.kq8
    public final boolean Z(int i, PdfAnnotation pdfAnnotation) {
        pdfAnnotation.getClass();
        throw e;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.kq8
    public final int d() {
        return this.b;
    }

    @Override // defpackage.kq8
    public final void d1(int i) {
        throw e;
    }

    @Override // defpackage.kq8
    public final int e() {
        return this.c;
    }

    @Override // defpackage.kq8
    public final List e0() {
        throw d;
    }

    @Override // defpackage.kq8
    public final List j1() {
        throw d;
    }

    @Override // defpackage.kq8
    public final List r0() {
        throw d;
    }

    @Override // defpackage.kq8
    public final void v0(Bitmap bitmap, yn9 yn9Var) {
        yn9Var.getClass();
        this.a.render(bitmap, null, null, 1);
    }

    @Override // defpackage.kq8
    public final List y(String str) {
        throw d;
    }
}
