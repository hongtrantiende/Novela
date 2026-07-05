package defpackage;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.pm.SigningInfo;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.service.credentials.BeginCreateCredentialRequest;
import android.service.credentials.BeginGetCredentialOption;
import android.service.credentials.BeginGetCredentialRequest;
import android.service.credentials.CallingAppInfo;
import android.service.credentials.ClearCredentialStateRequest;
import android.text.GraphemeClusterSegmentFinder;
import android.text.Layout;
import android.util.Log;
import android.view.SurfaceView;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: k4  reason: default package */
/* loaded from: classes.dex */
public abstract class k4 {
    public static void A(PendingIntent pendingIntent) {
        try {
            ActivityOptions makeBasic = ActivityOptions.makeBasic();
            if (Build.VERSION.SDK_INT >= 36) {
                makeBasic.setPendingIntentBackgroundActivityStartMode(4);
            } else {
                makeBasic.setPendingIntentBackgroundActivityStartMode(1);
            }
            pendingIntent.send(makeBasic.toBundle());
        } catch (PendingIntent.CanceledException e) {
            Log.e("TextClassification", "error sending pendingIntent: " + pendingIntent + " error: " + e);
        }
    }

    public static void B(AccessibilityEvent accessibilityEvent, boolean z) {
        accessibilityEvent.setAccessibilityDataSensitive(z);
    }

    public static void C(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
        accessibilityNodeInfo.setAccessibilityDataSensitive(z);
    }

    public static void D(EditorInfo editorInfo) {
        editorInfo.setSupportedHandwritingGestures(tl1.B(SelectGesture.class, DeleteGesture.class, SelectRangeGesture.class, DeleteRangeGesture.class, JoinOrSplitGesture.class, InsertGesture.class, RemoveSpaceGesture.class));
        editorInfo.setSupportedHandwritingGesturePreviews(b00.F0(new Class[]{SelectGesture.class, DeleteGesture.class, SelectRangeGesture.class, DeleteRangeGesture.class}));
    }

    public static void E(TextView textView, int i, float f) {
        textView.setLineHeight(i, f);
    }

    public static void F(ActivityOptions activityOptions) {
        activityOptions.setShareIdentityEnabled(false);
    }

    public static void G(SurfaceView surfaceView) {
        surfaceView.setSurfaceLifecycle(2);
    }

    public static final void a(CursorAnchorInfo.Builder builder, fvb fvbVar, rk9 rk9Var) {
        if (!rk9Var.l()) {
            it7 it7Var = fvbVar.b;
            int i = it7Var.f - 1;
            if (i < 0) {
                i = 0;
            }
            int n = dce.n(it7Var.e(rk9Var.b), 0, i);
            int n2 = dce.n(it7Var.e(rk9Var.d), 0, i);
            if (n > n2) {
                return;
            }
            while (true) {
                builder.addVisibleLineBounds(fvbVar.g(n), it7Var.f(n), fvbVar.h(n), it7Var.b(n));
                if (n != n2) {
                    n++;
                } else {
                    return;
                }
            }
        }
    }

    public static final void b(CursorAnchorInfo.Builder builder, fvb fvbVar, rk9 rk9Var) {
        if (!rk9Var.l()) {
            it7 it7Var = fvbVar.b;
            int i = it7Var.f - 1;
            if (i < 0) {
                i = 0;
            }
            int n = dce.n(it7Var.e(rk9Var.b), 0, i);
            int n2 = dce.n(it7Var.e(rk9Var.d), 0, i);
            if (n > n2) {
                return;
            }
            while (true) {
                builder.addVisibleLineBounds(fvbVar.g(n), it7Var.f(n), fvbVar.h(n), it7Var.b(n));
                if (n != n2) {
                    n++;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [zj0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6, types: [zj0, java.lang.Object] */
    public static zj0 c(BeginCreateCredentialRequest beginCreateCredentialRequest) {
        String type = beginCreateCredentialRequest.getType();
        type.getClass();
        Bundle data = beginCreateCredentialRequest.getData();
        data.getClass();
        CallingAppInfo callingAppInfo = beginCreateCredentialRequest.getCallingAppInfo();
        if (callingAppInfo != null) {
            String packageName = callingAppInfo.getPackageName();
            packageName.getClass();
            SigningInfo signingInfo = callingAppInfo.getSigningInfo();
            signingInfo.getClass();
            callingAppInfo.getOrigin();
            oo3.c(signingInfo);
            if (packageName.length() <= 0) {
                vs.m("packageName must not be empty");
                return null;
            }
        }
        try {
            if (type.equals("android.credentials.TYPE_PASSWORD_CREDENTIAL")) {
                try {
                    return new Object();
                } catch (Exception unused) {
                    throw new Exception();
                }
            } else if (type.equals("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL")) {
                try {
                    String string = data.getString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON");
                    data.getByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH");
                    string.getClass();
                    ?? obj = new Object();
                    if (string.length() != 0) {
                        try {
                            new JSONObject(string);
                            data.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", string);
                            return obj;
                        } catch (Exception unused2) {
                        }
                    }
                    throw new IllegalArgumentException("requestJson must not be empty, and must be a valid JSON");
                } catch (Exception unused3) {
                    throw new Exception();
                }
            } else {
                return new zj0(type, data);
            }
        } catch (ft4 unused4) {
            return new zj0(type, data);
        }
        return new zj0(type, data);
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, hq7] */
    public static hq7 d(BeginGetCredentialRequest beginGetCredentialRequest) {
        Object obj;
        Object obj2;
        ArrayList arrayList = new ArrayList();
        List<BeginGetCredentialOption> beginGetCredentialOptions = beginGetCredentialRequest.getBeginGetCredentialOptions();
        beginGetCredentialOptions.getClass();
        for (BeginGetCredentialOption beginGetCredentialOption : beginGetCredentialOptions) {
            String id = beginGetCredentialOption.getId();
            id.getClass();
            String type = beginGetCredentialOption.getType();
            type.getClass();
            Bundle candidateQueryData = beginGetCredentialOption.getCandidateQueryData();
            candidateQueryData.getClass();
            if (type.equals("android.credentials.TYPE_PASSWORD_CREDENTIAL")) {
                ArrayList<String> stringArrayList = candidateQueryData.getStringArrayList("androidx.credentials.BUNDLE_KEY_ALLOWED_USER_IDS");
                if (stringArrayList != null) {
                    sl1.H0(stringArrayList);
                }
                obj2 = new Object();
            } else {
                if (type.equals("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL")) {
                    try {
                        String string = candidateQueryData.getString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON");
                        candidateQueryData.getByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH");
                        string.getClass();
                        obj = new Object();
                        if (string.length() != 0) {
                            try {
                                new JSONObject(string);
                            } catch (Exception unused) {
                            }
                        }
                        throw new IllegalArgumentException("requestJson must not be empty, and must be a valid JSON");
                    } catch (Exception unused2) {
                        throw new Exception();
                    }
                }
                obj = new Object();
                if (id.length() > 0) {
                    if (type.length() <= 0) {
                        vs.m("type should not be empty");
                        return null;
                    }
                } else {
                    vs.m("id should not be empty");
                    return null;
                }
                obj2 = obj;
            }
            arrayList.add(obj2);
        }
        CallingAppInfo callingAppInfo = beginGetCredentialRequest.getCallingAppInfo();
        if (callingAppInfo != null) {
            String packageName = callingAppInfo.getPackageName();
            packageName.getClass();
            SigningInfo signingInfo = callingAppInfo.getSigningInfo();
            signingInfo.getClass();
            callingAppInfo.getOrigin();
            oo3.c(signingInfo);
            if (packageName.length() <= 0) {
                vs.m("packageName must not be empty");
                return null;
            }
        }
        return new Object();
    }

    public static iv8 e(ClearCredentialStateRequest clearCredentialStateRequest) {
        String packageName = clearCredentialStateRequest.getCallingAppInfo().getPackageName();
        packageName.getClass();
        SigningInfo signingInfo = clearCredentialStateRequest.getCallingAppInfo().getSigningInfo();
        signingInfo.getClass();
        clearCredentialStateRequest.getCallingAppInfo().getOrigin();
        oo3.c(signingInfo);
        if (packageName.length() > 0) {
            return new iv8(1);
        }
        vs.m("packageName must not be empty");
        return null;
    }

    public static int f(mkc mkcVar, HandwritingGesture handwritingGesture) {
        dub dubVar = mkcVar.a;
        og0 og0Var = mkcVar.b;
        dubVar.b.a().k();
        frb frbVar = dubVar.b;
        frbVar.E = null;
        mkcVar.o(frbVar);
        dub.a(dubVar, og0Var, true, wrb.a);
        dubVar.f(true);
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        mkc.k(mkcVar, fallbackText, false, 12);
        return 5;
    }

    public static int g(HandwritingGesture handwritingGesture, cl7 cl7Var) {
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        cl7Var.invoke(new mq1(fallbackText, 1));
        return 5;
    }

    public static JobScheduler h(JobScheduler jobScheduler) {
        JobScheduler forNamespace = jobScheduler.forNamespace("androidx.work.systemjobscheduler");
        forNamespace.getClass();
        return forNamespace;
    }

    public static AccessibilityNodeInfo.AccessibilityAction i() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
    }

    public static float j(VelocityTracker velocityTracker, int i) {
        return velocityTracker.getAxisVelocity(i);
    }

    public static void k(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
        accessibilityNodeInfo.getBoundsInWindow(rect);
    }

    public static CharSequence l(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getContainerTitle();
    }

    public static int[] m(dvb dvbVar, RectF rectF, int i, final sj sjVar) {
        zu graphemeClusterSegmentFinder;
        if (i == 1) {
            graphemeClusterSegmentFinder = new zu(new hvc(4, dvbVar.f.getText(), dvbVar.l()));
        } else {
            graphemeClusterSegmentFinder = new GraphemeClusterSegmentFinder(dvbVar.f.getText(), dvbVar.a);
        }
        return dvbVar.f.getRangeForRect(rectF, graphemeClusterSegmentFinder, new Layout.TextInclusionStrategy() { // from class: mj
            public final boolean isSegmentInside(RectF rectF2, RectF rectF3) {
                return ((Boolean) sj.this.invoke(rectF2, rectF3)).booleanValue();
            }
        });
    }

    public static float n(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHandwritingGestureLineMargin();
    }

    public static float o(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHandwritingSlop();
    }

    public static int p(ViewConfiguration viewConfiguration, int i, int i2, int i3) {
        return viewConfiguration.getScaledMaximumFlingVelocity(i, i2, i3);
    }

    public static int q(ViewConfiguration viewConfiguration, int i, int i2, int i3) {
        return viewConfiguration.getScaledMinimumFlingVelocity(i, i2, i3);
    }

    public static void r(mkc mkcVar, long j, int i) {
        boolean d = fxb.d(j);
        wrb wrbVar = wrb.a;
        if (d) {
            dub dubVar = mkcVar.a;
            og0 og0Var = mkcVar.b;
            dubVar.b.a().k();
            frb frbVar = dubVar.b;
            frbVar.E = null;
            mkcVar.o(frbVar);
            dub.a(dubVar, og0Var, true, wrbVar);
            dubVar.f(true);
            return;
        }
        long h = mkcVar.h(j);
        dub dubVar2 = mkcVar.a;
        og0 og0Var2 = mkcVar.b;
        dubVar2.b.a().k();
        frb frbVar2 = dubVar2.b;
        int i2 = (int) (h >> 32);
        int i3 = (int) (h & 4294967295L);
        tb1 tb1Var = frbVar2.c;
        if (i2 < i3) {
            frbVar2.E = new yk8(new oub(i), new fxb(sze.a(dce.n(i2, 0, tb1Var.length()), dce.n(i3, 0, tb1Var.length()))));
            dub.a(dubVar2, og0Var2, true, wrbVar);
            dubVar2.f(true);
            return;
        }
        vs.m(rs8.k("Do not set reversed or empty range: ", i2, i3, " > "));
    }

    public static boolean s(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isAccessibilityDataSensitive();
    }

    public static boolean t(AccessibilityManager accessibilityManager) {
        return accessibilityManager.isRequestFromAccessibilityTool();
    }

    public static final ColorSpace u(sm1 sm1Var) {
        if (c16.i(sm1Var, wm1.v)) {
            return ColorSpace.get(ColorSpace.Named.BT2020_HLG);
        }
        if (c16.i(sm1Var, wm1.w)) {
            return ColorSpace.get(ColorSpace.Named.BT2020_PQ);
        }
        return null;
    }

    public static void v(long j, ps psVar, boolean z, cl7 cl7Var) {
        if (z) {
            j = jqe.b(j, psVar);
        }
        int i = (int) (4294967295L & j);
        cl7Var.invoke(new r35(new un3[]{new aca(i, i), new i13(fxb.e(j), 0)}));
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [xl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [xl9, java.lang.Object] */
    public static int w(ol6 ol6Var, HandwritingGesture handwritingGesture, gtb gtbVar, ucd ucdVar, cl7 cl7Var) {
        ps psVar;
        int i;
        int i2;
        gvb d;
        int i3;
        gvb d2;
        int i4;
        int i5;
        ps psVar2 = ol6Var.j;
        if (psVar2 != null) {
            gvb d3 = ol6Var.d();
            fvb fvbVar = null;
            if (d3 != null) {
                psVar = d3.a.a.a;
            } else {
                psVar = null;
            }
            if (!psVar2.equals(psVar)) {
                return 3;
            }
            boolean z = false;
            int i6 = 0;
            boolean z2 = false;
            int i7 = 0;
            if (handwritingGesture instanceof SelectGesture) {
                SelectGesture selectGesture = (SelectGesture) handwritingGesture;
                rk9 E = ipe.E(selectGesture.getSelectionArea());
                if (selectGesture.getGranularity() == 1) {
                    i6 = 1;
                }
                long q = jqe.q(ol6Var, E, i6);
                if (fxb.d(q)) {
                    return g(selectGesture, cl7Var);
                }
                cl7Var.invoke(new aca((int) (q >> 32), (int) (q & 4294967295L)));
                if (gtbVar != null) {
                    gtbVar.h(true);
                    return 1;
                }
            } else if (handwritingGesture instanceof DeleteGesture) {
                DeleteGesture deleteGesture = (DeleteGesture) handwritingGesture;
                if (deleteGesture.getGranularity() != 1) {
                    i5 = 0;
                } else {
                    i5 = 1;
                }
                long q2 = jqe.q(ol6Var, ipe.E(deleteGesture.getDeletionArea()), i5);
                if (fxb.d(q2)) {
                    return g(deleteGesture, cl7Var);
                }
                if (i5 == 1) {
                    z2 = true;
                }
                v(q2, psVar2, z2, cl7Var);
                return 1;
            } else if (handwritingGesture instanceof SelectRangeGesture) {
                SelectRangeGesture selectRangeGesture = (SelectRangeGesture) handwritingGesture;
                rk9 E2 = ipe.E(selectRangeGesture.getSelectionStartArea());
                rk9 E3 = ipe.E(selectRangeGesture.getSelectionEndArea());
                if (selectRangeGesture.getGranularity() == 1) {
                    i7 = 1;
                }
                long d4 = jqe.d(ol6Var, E2, E3, i7);
                if (fxb.d(d4)) {
                    return g(selectRangeGesture, cl7Var);
                }
                cl7Var.invoke(new aca((int) (d4 >> 32), (int) (d4 & 4294967295L)));
                if (gtbVar != null) {
                    gtbVar.h(true);
                }
            } else if (handwritingGesture instanceof DeleteRangeGesture) {
                DeleteRangeGesture deleteRangeGesture = (DeleteRangeGesture) handwritingGesture;
                if (deleteRangeGesture.getGranularity() != 1) {
                    i4 = 0;
                } else {
                    i4 = 1;
                }
                long d5 = jqe.d(ol6Var, ipe.E(deleteRangeGesture.getDeletionStartArea()), ipe.E(deleteRangeGesture.getDeletionEndArea()), i4);
                if (fxb.d(d5)) {
                    return g(deleteRangeGesture, cl7Var);
                }
                if (i4 == 1) {
                    z = true;
                }
                v(d5, psVar2, z, cl7Var);
                return 1;
            } else if (handwritingGesture instanceof JoinOrSplitGesture) {
                JoinOrSplitGesture joinOrSplitGesture = (JoinOrSplitGesture) handwritingGesture;
                if (ucdVar == null) {
                    return g(joinOrSplitGesture, cl7Var);
                }
                long h = jqe.h(joinOrSplitGesture.getJoinOrSplitPoint());
                gvb d6 = ol6Var.d();
                if (d6 != null) {
                    i3 = jqe.p(d6.a.b, h, ol6Var.c(), ucdVar);
                } else {
                    i3 = -1;
                }
                if (i3 != -1 && ((d2 = ol6Var.d()) == null || !jqe.f(d2.a, i3))) {
                    long g = jqe.g(psVar2, i3);
                    if (fxb.d(g)) {
                        int i8 = (int) (g >> 32);
                        cl7Var.invoke(new r35(new un3[]{new aca(i8, i8), new mq1(" ", 1)}));
                        return 1;
                    }
                    v(g, psVar2, false, cl7Var);
                    return 1;
                }
                return g(joinOrSplitGesture, cl7Var);
            } else if (handwritingGesture instanceof InsertGesture) {
                InsertGesture insertGesture = (InsertGesture) handwritingGesture;
                if (ucdVar == null) {
                    return g(insertGesture, cl7Var);
                }
                long h2 = jqe.h(insertGesture.getInsertionPoint());
                gvb d7 = ol6Var.d();
                if (d7 != null) {
                    i2 = jqe.p(d7.a.b, h2, ol6Var.c(), ucdVar);
                } else {
                    i2 = -1;
                }
                if (i2 != -1 && ((d = ol6Var.d()) == null || !jqe.f(d.a, i2))) {
                    cl7Var.invoke(new r35(new un3[]{new aca(i2, i2), new mq1(insertGesture.getTextToInsert(), 1)}));
                    return 1;
                }
                return g(insertGesture, cl7Var);
            } else if (!(handwritingGesture instanceof RemoveSpaceGesture)) {
                return 2;
            } else {
                RemoveSpaceGesture removeSpaceGesture = (RemoveSpaceGesture) handwritingGesture;
                gvb d8 = ol6Var.d();
                if (d8 != null) {
                    fvbVar = d8.a;
                }
                long c = jqe.c(fvbVar, jqe.h(removeSpaceGesture.getStartPoint()), jqe.h(removeSpaceGesture.getEndPoint()), ol6Var.c(), ucdVar);
                if (fxb.d(c)) {
                    return g(removeSpaceGesture, cl7Var);
                }
                ?? obj = new Object();
                obj.a = -1;
                ?? obj2 = new Object();
                obj2.a = -1;
                String h3 = new gm9("\\s+").h(sze.l(c, psVar2), new q35(obj, obj2, 0));
                int i9 = obj.a;
                if (i9 != -1 && (i = obj2.a) != -1) {
                    int i10 = (int) (c >> 32);
                    cl7Var.invoke(new r35(new un3[]{new aca(i10 + i9, i10 + i), new mq1(h3.substring(i9, h3.length() - (fxb.e(c) - obj2.a)), 1)}));
                    return 1;
                }
                return g(removeSpaceGesture, cl7Var);
            }
            return 1;
        }
        return 3;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [xl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [xl9, java.lang.Object] */
    public static int x(mkc mkcVar, HandwritingGesture handwritingGesture, hvb hvbVar, vt4 vt4Var, ucd ucdVar) {
        int i;
        int i2;
        int i3;
        fvb c;
        int i4 = 0;
        if (handwritingGesture instanceof SelectGesture) {
            SelectGesture selectGesture = (SelectGesture) handwritingGesture;
            rk9 E = ipe.E(selectGesture.getSelectionArea());
            if (selectGesture.getGranularity() == 1) {
                i4 = 1;
            }
            long r = jqe.r(hvbVar, E, i4);
            if (fxb.d(r)) {
                return f(mkcVar, selectGesture);
            }
            mkcVar.m(r);
            if (vt4Var != null) {
                vt4Var.invoke();
                return 1;
            }
        } else if (handwritingGesture instanceof DeleteGesture) {
            DeleteGesture deleteGesture = (DeleteGesture) handwritingGesture;
            if (deleteGesture.getGranularity() == 1) {
                i4 = 1;
            }
            long r2 = jqe.r(hvbVar, ipe.E(deleteGesture.getDeletionArea()), i4);
            if (fxb.d(r2)) {
                return f(mkcVar, deleteGesture);
            }
            if (i4 == 1) {
                r2 = jqe.b(r2, mkcVar.f());
            }
            mkc.l(mkcVar, "", r2, false, 12);
            return 1;
        } else if (handwritingGesture instanceof SelectRangeGesture) {
            SelectRangeGesture selectRangeGesture = (SelectRangeGesture) handwritingGesture;
            rk9 E2 = ipe.E(selectRangeGesture.getSelectionStartArea());
            rk9 E3 = ipe.E(selectRangeGesture.getSelectionEndArea());
            if (selectRangeGesture.getGranularity() == 1) {
                i4 = 1;
            }
            long e = jqe.e(hvbVar, E2, E3, i4);
            if (fxb.d(e)) {
                return f(mkcVar, selectRangeGesture);
            }
            mkcVar.m(e);
            if (vt4Var != null) {
                vt4Var.invoke();
            }
        } else if (handwritingGesture instanceof DeleteRangeGesture) {
            DeleteRangeGesture deleteRangeGesture = (DeleteRangeGesture) handwritingGesture;
            if (deleteRangeGesture.getGranularity() == 1) {
                i4 = 1;
            }
            long e2 = jqe.e(hvbVar, ipe.E(deleteRangeGesture.getDeletionStartArea()), ipe.E(deleteRangeGesture.getDeletionEndArea()), i4);
            if (fxb.d(e2)) {
                return f(mkcVar, deleteRangeGesture);
            }
            if (i4 == 1) {
                e2 = jqe.b(e2, mkcVar.f());
            }
            mkc.l(mkcVar, "", e2, false, 12);
            return 1;
        } else if (handwritingGesture instanceof JoinOrSplitGesture) {
            JoinOrSplitGesture joinOrSplitGesture = (JoinOrSplitGesture) handwritingGesture;
            if (mkcVar.d() != mkcVar.a.d()) {
                return 3;
            }
            long h = jqe.h(joinOrSplitGesture.getJoinOrSplitPoint());
            fvb c2 = hvbVar.c();
            if (c2 != null) {
                i3 = jqe.p(c2.b, h, hvbVar.e(), ucdVar);
            } else {
                i3 = -1;
            }
            if (i3 != -1 && ((c = hvbVar.c()) == null || !jqe.f(c, i3))) {
                long g = jqe.g(mkcVar.f(), i3);
                if (fxb.d(g)) {
                    mkc.l(mkcVar, " ", g, false, 12);
                    return 1;
                }
                mkc.l(mkcVar, "", g, false, 12);
                return 1;
            }
            return f(mkcVar, joinOrSplitGesture);
        } else if (handwritingGesture instanceof InsertGesture) {
            InsertGesture insertGesture = (InsertGesture) handwritingGesture;
            long h2 = jqe.h(insertGesture.getInsertionPoint());
            fvb c3 = hvbVar.c();
            if (c3 != null) {
                i2 = jqe.p(c3.b, h2, hvbVar.e(), ucdVar);
            } else {
                i2 = -1;
            }
            if (i2 == -1) {
                return f(mkcVar, insertGesture);
            }
            mkc.l(mkcVar, insertGesture.getTextToInsert(), sze.a(i2, i2), false, 12);
            return 1;
        } else if (handwritingGesture instanceof RemoveSpaceGesture) {
            RemoveSpaceGesture removeSpaceGesture = (RemoveSpaceGesture) handwritingGesture;
            long c4 = jqe.c(hvbVar.c(), jqe.h(removeSpaceGesture.getStartPoint()), jqe.h(removeSpaceGesture.getEndPoint()), hvbVar.e(), ucdVar);
            if (fxb.d(c4)) {
                return f(mkcVar, removeSpaceGesture);
            }
            ?? obj = new Object();
            obj.a = -1;
            ?? obj2 = new Object();
            obj2.a = -1;
            String h3 = new gm9("\\s+").h(sze.l(c4, mkcVar.f()), new q35(obj, obj2, 1));
            int i5 = obj.a;
            if (i5 != -1 && (i = obj2.a) != -1) {
                int i6 = (int) (c4 >> 32);
                mkc.l(mkcVar, h3.substring(obj.a, h3.length() - (fxb.e(c4) - obj2.a)), sze.a(i5 + i6, i6 + i), false, 12);
                return 1;
            }
            return f(mkcVar, removeSpaceGesture);
        } else {
            return 2;
        }
        return 1;
    }

    public static boolean y(ol6 ol6Var, PreviewableHandwritingGesture previewableHandwritingGesture, gtb gtbVar, CancellationSignal cancellationSignal) {
        ps psVar;
        int i;
        int i2;
        int i3;
        int i4;
        ps psVar2 = ol6Var.j;
        if (psVar2 != null) {
            gvb d = ol6Var.d();
            if (d != null) {
                psVar = d.a.a.a;
            } else {
                psVar = null;
            }
            if (psVar2.equals(psVar)) {
                boolean z = previewableHandwritingGesture instanceof SelectGesture;
                l35 l35Var = l35.a;
                if (z) {
                    SelectGesture selectGesture = (SelectGesture) previewableHandwritingGesture;
                    if (gtbVar != null) {
                        rk9 E = ipe.E(selectGesture.getSelectionArea());
                        if (selectGesture.getGranularity() != 1) {
                            i4 = 0;
                        } else {
                            i4 = 1;
                        }
                        long q = jqe.q(ol6Var, E, i4);
                        ol6 ol6Var2 = gtbVar.d;
                        if (ol6Var2 != null) {
                            ol6Var2.f(q);
                        }
                        ol6 ol6Var3 = gtbVar.d;
                        if (ol6Var3 != null) {
                            ol6Var3.e(fxb.b);
                        }
                        if (!fxb.d(q)) {
                            gtbVar.t(false);
                            gtbVar.q(l35Var);
                        }
                    }
                } else if (previewableHandwritingGesture instanceof DeleteGesture) {
                    DeleteGesture deleteGesture = (DeleteGesture) previewableHandwritingGesture;
                    if (gtbVar != null) {
                        rk9 E2 = ipe.E(deleteGesture.getDeletionArea());
                        if (deleteGesture.getGranularity() != 1) {
                            i3 = 0;
                        } else {
                            i3 = 1;
                        }
                        long q2 = jqe.q(ol6Var, E2, i3);
                        ol6 ol6Var4 = gtbVar.d;
                        if (ol6Var4 != null) {
                            ol6Var4.e(q2);
                        }
                        ol6 ol6Var5 = gtbVar.d;
                        if (ol6Var5 != null) {
                            ol6Var5.f(fxb.b);
                        }
                        if (!fxb.d(q2)) {
                            gtbVar.t(false);
                            gtbVar.q(l35Var);
                        }
                    }
                } else if (previewableHandwritingGesture instanceof SelectRangeGesture) {
                    SelectRangeGesture selectRangeGesture = (SelectRangeGesture) previewableHandwritingGesture;
                    if (gtbVar != null) {
                        rk9 E3 = ipe.E(selectRangeGesture.getSelectionStartArea());
                        rk9 E4 = ipe.E(selectRangeGesture.getSelectionEndArea());
                        if (selectRangeGesture.getGranularity() != 1) {
                            i2 = 0;
                        } else {
                            i2 = 1;
                        }
                        long d2 = jqe.d(ol6Var, E3, E4, i2);
                        ol6 ol6Var6 = gtbVar.d;
                        if (ol6Var6 != null) {
                            ol6Var6.f(d2);
                        }
                        ol6 ol6Var7 = gtbVar.d;
                        if (ol6Var7 != null) {
                            ol6Var7.e(fxb.b);
                        }
                        if (!fxb.d(d2)) {
                            gtbVar.t(false);
                            gtbVar.q(l35Var);
                        }
                    }
                } else if (previewableHandwritingGesture instanceof DeleteRangeGesture) {
                    DeleteRangeGesture deleteRangeGesture = (DeleteRangeGesture) previewableHandwritingGesture;
                    if (gtbVar != null) {
                        rk9 E5 = ipe.E(deleteRangeGesture.getDeletionStartArea());
                        rk9 E6 = ipe.E(deleteRangeGesture.getDeletionEndArea());
                        if (deleteRangeGesture.getGranularity() != 1) {
                            i = 0;
                        } else {
                            i = 1;
                        }
                        long d3 = jqe.d(ol6Var, E5, E6, i);
                        ol6 ol6Var8 = gtbVar.d;
                        if (ol6Var8 != null) {
                            ol6Var8.e(d3);
                        }
                        ol6 ol6Var9 = gtbVar.d;
                        if (ol6Var9 != null) {
                            ol6Var9.f(fxb.b);
                        }
                        if (!fxb.d(d3)) {
                            gtbVar.t(false);
                            gtbVar.q(l35Var);
                        }
                    }
                }
                if (cancellationSignal != null) {
                    cancellationSignal.setOnCancelListener(new lw1(gtbVar, 1));
                }
                return true;
            }
        }
        return false;
    }

    public static boolean z(mkc mkcVar, PreviewableHandwritingGesture previewableHandwritingGesture, hvb hvbVar, CancellationSignal cancellationSignal) {
        int i;
        int i2;
        int i3 = 0;
        if (previewableHandwritingGesture instanceof SelectGesture) {
            SelectGesture selectGesture = (SelectGesture) previewableHandwritingGesture;
            rk9 E = ipe.E(selectGesture.getSelectionArea());
            if (selectGesture.getGranularity() != 1) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            r(mkcVar, jqe.r(hvbVar, E, i2), 0);
        } else if (previewableHandwritingGesture instanceof DeleteGesture) {
            DeleteGesture deleteGesture = (DeleteGesture) previewableHandwritingGesture;
            rk9 E2 = ipe.E(deleteGesture.getDeletionArea());
            if (deleteGesture.getGranularity() == 1) {
                i3 = 1;
            }
            r(mkcVar, jqe.r(hvbVar, E2, i3), 1);
        } else if (previewableHandwritingGesture instanceof SelectRangeGesture) {
            SelectRangeGesture selectRangeGesture = (SelectRangeGesture) previewableHandwritingGesture;
            rk9 E3 = ipe.E(selectRangeGesture.getSelectionStartArea());
            rk9 E4 = ipe.E(selectRangeGesture.getSelectionEndArea());
            if (selectRangeGesture.getGranularity() != 1) {
                i = 0;
            } else {
                i = 1;
            }
            r(mkcVar, jqe.e(hvbVar, E3, E4, i), 0);
        } else if (!(previewableHandwritingGesture instanceof DeleteRangeGesture)) {
            return false;
        } else {
            DeleteRangeGesture deleteRangeGesture = (DeleteRangeGesture) previewableHandwritingGesture;
            rk9 E5 = ipe.E(deleteRangeGesture.getDeletionStartArea());
            rk9 E6 = ipe.E(deleteRangeGesture.getDeletionEndArea());
            if (deleteRangeGesture.getGranularity() == 1) {
                i3 = 1;
            }
            r(mkcVar, jqe.e(hvbVar, E5, E6, i3), 1);
        }
        if (cancellationSignal != null) {
            cancellationSignal.setOnCancelListener(new lw1(mkcVar, 2));
        }
        return true;
    }
}
