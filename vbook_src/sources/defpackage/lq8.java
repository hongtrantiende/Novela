package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.pdf.PdfRenderer;
import android.graphics.pdf.PdfRendererPreV;
import android.graphics.pdf.RenderParams;
import android.graphics.pdf.component.PdfAnnotation;
import android.graphics.pdf.models.FormEditRecord;
import android.graphics.pdf.models.selection.PageSelection;
import android.graphics.pdf.models.selection.SelectionBoundary;
import android.util.Pair;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lq8  reason: default package */
/* loaded from: classes.dex */
public final class lq8 implements kq8 {
    public final /* synthetic */ int a = 0;
    public final int b;
    public final int c;
    public boolean d;
    public final AutoCloseable e;

    public lq8(PdfRendererPreV.Page page) {
        this.e = page;
        this.b = page.getHeight();
        this.c = page.getWidth();
    }

    @Override // defpackage.kq8
    public final int A0(PdfAnnotation pdfAnnotation) {
        int i = this.a;
        PdfRendererPreV.Page page = this.e;
        pdfAnnotation.getClass();
        switch (i) {
            case 0:
                return ((PdfRenderer.Page) page).addPageAnnotation(pdfAnnotation);
            default:
                return page.addPageAnnotation(pdfAnnotation);
        }
    }

    @Override // defpackage.kq8
    public final Pair D(PointF pointF, int[] iArr) {
        int i = this.a;
        PdfRendererPreV.Page page = this.e;
        switch (i) {
            case 0:
                return ((PdfRenderer.Page) page).getTopPageObjectAtPosition(pointF, iArr);
            default:
                return page.getTopPageObjectAtPosition(pointF, iArr);
        }
    }

    @Override // defpackage.kq8
    public final List G0(FormEditRecord formEditRecord) {
        int i = this.a;
        PdfRendererPreV.Page page = this.e;
        switch (i) {
            case 0:
                List applyEdit = ((PdfRenderer.Page) page).applyEdit(formEditRecord);
                applyEdit.getClass();
                return applyEdit;
            default:
                List applyEdit2 = page.applyEdit(formEditRecord);
                applyEdit2.getClass();
                return applyEdit2;
        }
    }

    @Override // defpackage.kq8
    public final PageSelection O0(SelectionBoundary selectionBoundary, SelectionBoundary selectionBoundary2) {
        int i = this.a;
        PdfRendererPreV.Page page = this.e;
        selectionBoundary.getClass();
        selectionBoundary2.getClass();
        switch (i) {
            case 0:
                return ((PdfRenderer.Page) page).selectContent(selectionBoundary, selectionBoundary2);
            default:
                return page.selectContent(selectionBoundary, selectionBoundary2);
        }
    }

    @Override // defpackage.kq8
    public final List R() {
        int i = this.a;
        PdfRendererPreV.Page page = this.e;
        switch (i) {
            case 0:
                List gotoLinks = ((PdfRenderer.Page) page).getGotoLinks();
                gotoLinks.getClass();
                return gotoLinks;
            default:
                List gotoLinks2 = page.getGotoLinks();
                gotoLinks2.getClass();
                return gotoLinks2;
        }
    }

    @Override // defpackage.kq8
    public final List X() {
        int i = this.a;
        PdfRendererPreV.Page page = this.e;
        switch (i) {
            case 0:
                List formWidgetInfos = ((PdfRenderer.Page) page).getFormWidgetInfos();
                formWidgetInfos.getClass();
                return formWidgetInfos;
            default:
                List formWidgetInfos2 = page.getFormWidgetInfos();
                formWidgetInfos2.getClass();
                return formWidgetInfos2;
        }
    }

    @Override // defpackage.kq8
    public final List X0(int[] iArr) {
        int i = this.a;
        PdfRendererPreV.Page page = this.e;
        switch (i) {
            case 0:
                List formWidgetInfos = ((PdfRenderer.Page) page).getFormWidgetInfos(iArr);
                formWidgetInfos.getClass();
                return formWidgetInfos;
            default:
                List formWidgetInfos2 = page.getFormWidgetInfos(iArr);
                formWidgetInfos2.getClass();
                return formWidgetInfos2;
        }
    }

    @Override // defpackage.kq8
    public final void Y(Bitmap bitmap, int i, int i2, int i3, int i4, yn9 yn9Var) {
        int i5 = this.a;
        PdfRendererPreV.Page page = this.e;
        yn9Var.getClass();
        switch (i5) {
            case 0:
                Matrix s = jqe.s(i, i2, i3, i4, this.c, this.b);
                RenderParams b = t4.b(yn9Var);
                if (!this.d) {
                    ((PdfRenderer.Page) page).render(bitmap, (Rect) null, s, b);
                    return;
                } else {
                    vs.k("Page is closed");
                    return;
                }
            default:
                Matrix s2 = jqe.s(i, i2, i3, i4, this.c, this.b);
                if (!this.d) {
                    page.render(bitmap, (Rect) null, s2, t4.b(yn9Var));
                    return;
                } else {
                    vs.k("Page is closed");
                    return;
                }
        }
    }

    @Override // defpackage.kq8
    public final List Y0() {
        int i = this.a;
        PdfRendererPreV.Page page = this.e;
        switch (i) {
            case 0:
                List pageAnnotations = ((PdfRenderer.Page) page).getPageAnnotations();
                pageAnnotations.getClass();
                return pageAnnotations;
            default:
                List pageAnnotations2 = page.getPageAnnotations();
                pageAnnotations2.getClass();
                return pageAnnotations2;
        }
    }

    @Override // defpackage.kq8
    public final boolean Z(int i, PdfAnnotation pdfAnnotation) {
        int i2 = this.a;
        PdfRendererPreV.Page page = this.e;
        pdfAnnotation.getClass();
        switch (i2) {
            case 0:
                return ((PdfRenderer.Page) page).updatePageAnnotation(i, pdfAnnotation);
            default:
                return page.updatePageAnnotation(i, pdfAnnotation);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        int i = this.a;
        PdfRendererPreV.Page page = this.e;
        switch (i) {
            case 0:
                this.d = true;
                ((PdfRenderer.Page) page).close();
                return;
            default:
                this.d = true;
                page.close();
                return;
        }
    }

    @Override // defpackage.kq8
    public final int d() {
        switch (this.a) {
            case 0:
                return this.b;
            default:
                return this.b;
        }
    }

    @Override // defpackage.kq8
    public final void d1(int i) {
        int i2 = this.a;
        PdfRendererPreV.Page page = this.e;
        switch (i2) {
            case 0:
                ((PdfRenderer.Page) page).removePageAnnotation(i);
                return;
            default:
                page.removePageAnnotation(i);
                return;
        }
    }

    @Override // defpackage.kq8
    public final int e() {
        switch (this.a) {
            case 0:
                return this.c;
            default:
                return this.c;
        }
    }

    @Override // defpackage.kq8
    public final List e0() {
        int i = this.a;
        PdfRendererPreV.Page page = this.e;
        switch (i) {
            case 0:
                List imageContents = ((PdfRenderer.Page) page).getImageContents();
                imageContents.getClass();
                return imageContents;
            default:
                List imageContents2 = page.getImageContents();
                imageContents2.getClass();
                return imageContents2;
        }
    }

    @Override // defpackage.kq8
    public final List j1() {
        int i = this.a;
        PdfRendererPreV.Page page = this.e;
        switch (i) {
            case 0:
                List linkContents = ((PdfRenderer.Page) page).getLinkContents();
                linkContents.getClass();
                return linkContents;
            default:
                List linkContents2 = page.getLinkContents();
                linkContents2.getClass();
                return linkContents2;
        }
    }

    @Override // defpackage.kq8
    public final List r0() {
        int i = this.a;
        PdfRendererPreV.Page page = this.e;
        switch (i) {
            case 0:
                List textContents = ((PdfRenderer.Page) page).getTextContents();
                textContents.getClass();
                return textContents;
            default:
                List textContents2 = page.getTextContents();
                textContents2.getClass();
                return textContents2;
        }
    }

    @Override // defpackage.kq8
    public final void v0(Bitmap bitmap, yn9 yn9Var) {
        int i = this.a;
        PdfRendererPreV.Page page = this.e;
        yn9Var.getClass();
        switch (i) {
            case 0:
                RenderParams b = t4.b(yn9Var);
                if (!this.d) {
                    ((PdfRenderer.Page) page).render(bitmap, (Rect) null, (Matrix) null, b);
                    return;
                } else {
                    vs.k("Page is closed");
                    return;
                }
            default:
                if (!this.d) {
                    page.render(bitmap, (Rect) null, (Matrix) null, t4.b(yn9Var));
                    return;
                } else {
                    vs.k("Page is closed");
                    return;
                }
        }
    }

    @Override // defpackage.kq8
    public final List y(String str) {
        int i = this.a;
        PdfRendererPreV.Page page = this.e;
        switch (i) {
            case 0:
                List searchText = ((PdfRenderer.Page) page).searchText(str);
                searchText.getClass();
                return searchText;
            default:
                List searchText2 = page.searchText(str);
                searchText2.getClass();
                return searchText2;
        }
    }

    public lq8(PdfRenderer.Page page) {
        this.e = page;
        this.b = page.getHeight();
        this.c = page.getWidth();
    }
}
