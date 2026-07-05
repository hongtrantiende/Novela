package defpackage;

import android.graphics.Point;
import android.graphics.pdf.RenderParams;
import android.graphics.pdf.content.PdfPageTextContent;
import android.graphics.pdf.models.selection.PageSelection;
import android.graphics.pdf.models.selection.SelectionBoundary;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: t4  reason: default package */
/* loaded from: classes.dex */
public abstract class t4 {
    public static AccessibilityNodeInfo.AccessibilityAction a() {
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
        accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_EXTENDED_SELECTION;
        return accessibilityAction;
    }

    public static final RenderParams b(yn9 yn9Var) {
        yn9Var.getClass();
        if (qka.m(13)) {
            RenderParams.Builder builder = new RenderParams.Builder(yn9Var.a);
            builder.setRenderFlags(yn9Var.b);
            if (qka.m(19)) {
                builder.setRenderFormContentMode(yn9Var.c);
            }
            RenderParams build = builder.build();
            build.getClass();
            return build;
        }
        xk5.q("Operation supported above S");
        return null;
    }

    public static final SelectionBoundary c(jt1 jt1Var) {
        if (qka.m(13)) {
            Point point = (Point) jt1Var.c;
            if (point != null) {
                return f22.c(point);
            }
            f22.d();
            return f22.b(jt1Var.b);
        }
        xk5.q("Operation supported above S");
        return null;
    }

    public static final jt1 d(SelectionBoundary selectionBoundary) {
        if (qka.m(13)) {
            if (selectionBoundary.getPoint() == null) {
                selectionBoundary.getIndex();
                selectionBoundary.getIsRtl();
            }
            Point point = selectionBoundary.getPoint();
            selectionBoundary.getIsRtl();
            return new jt1(0, point);
        }
        xk5.q("Operation supported above S");
        return null;
    }

    public static final ni8 e(PageSelection pageSelection) {
        if (qka.m(13)) {
            pageSelection.getPage();
            SelectionBoundary start = pageSelection.getStart();
            start.getClass();
            jt1 d = d(start);
            SelectionBoundary stop = pageSelection.getStop();
            stop.getClass();
            jt1 d2 = d(stop);
            List<PdfPageTextContent> selectedTextContents = pageSelection.getSelectedTextContents();
            selectedTextContents.getClass();
            ArrayList arrayList = new ArrayList(tl1.s(selectedTextContents, 10));
            for (PdfPageTextContent pdfPageTextContent : selectedTextContents) {
                pdfPageTextContent.getClass();
                if (qka.m(13)) {
                    List bounds = pdfPageTextContent.getBounds();
                    bounds.getClass();
                    String text = pdfPageTextContent.getText();
                    text.getClass();
                    arrayList.add(new oq8(bounds, text));
                } else {
                    xk5.q("Operation supported above S");
                    return null;
                }
            }
            return new ni8(d, d2, arrayList);
        }
        xk5.q("Operation supported above S");
        return null;
    }
}
