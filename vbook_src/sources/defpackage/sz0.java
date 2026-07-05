package defpackage;

import android.graphics.BlendMode;
import android.util.CloseGuard;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillValue;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sz0 */
/* loaded from: classes.dex */
public final /* synthetic */ class sz0 implements u94 {
    public static final sz0 b = new sz0(0);
    public static final sz0 c = new sz0(1);
    public static final sz0 d = new sz0(2);
    public static final sz0 e = new sz0(3);
    public static final sz0 f = new sz0(4);
    public final /* synthetic */ int a;

    public /* synthetic */ sz0(int i) {
        this.a = i;
    }

    public static /* bridge */ /* synthetic */ BlendMode c() {
        return BlendMode.CLEAR;
    }

    public static /* bridge */ /* synthetic */ CloseGuard e(Object obj) {
        return (CloseGuard) obj;
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction f() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
    }

    public static /* bridge */ /* synthetic */ AutofillValue g(Object obj) {
        return (AutofillValue) obj;
    }

    public static /* bridge */ /* synthetic */ BlendMode h() {
        return BlendMode.COLOR_BURN;
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction i() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction j() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction k() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction l() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
    }

    public static /* bridge */ /* synthetic */ BlendMode n() {
        return BlendMode.SRC;
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction o() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
    }

    public static /* bridge */ /* synthetic */ BlendMode p() {
        return BlendMode.HARD_LIGHT;
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction q() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START;
    }

    public static /* bridge */ /* synthetic */ BlendMode r() {
        return BlendMode.SOFT_LIGHT;
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction s() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction t() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction u() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction v() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction w() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction x() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
    }

    public List a(String str, boolean z, boolean z2) {
        return o47.e(str, z, z2);
    }

    @Override // defpackage.u94
    public r94[] b() {
        switch (this.a) {
            case 5:
                return new r94[]{new y3()};
            case 6:
                return new r94[]{new a4()};
            case 21:
                return new r94[]{new q8(0)};
            default:
                return new r94[]{new vc()};
        }
    }

    public void y() {
    }
}
