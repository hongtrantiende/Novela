package defpackage;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ShortcutInfo;
import android.graphics.ColorFilter;
import android.graphics.RenderEffect;
import android.graphics.text.LineBreakConfig;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;
import android.text.BoringLayout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorBoundsInfo;
import android.view.inputmethod.InputMethodManager;
import android.window.OnBackInvokedDispatcher;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: r4  reason: default package */
/* loaded from: classes.dex */
public abstract class r4 {
    public static void A(InputMethodManager inputMethodManager, View view) {
        inputMethodManager.startStylusHandwriting(view);
    }

    public static final hl a(c3e c3eVar, em1 em1Var) {
        em1Var.getClass();
        ColorFilter colorFilter = em1Var.a;
        if (c3eVar != null) {
            RenderEffect createColorFilterEffect = RenderEffect.createColorFilterEffect(colorFilter, c3eVar.n());
            createColorFilterEffect.getClass();
            return new hl(createColorFilterEffect);
        }
        RenderEffect createColorFilterEffect2 = RenderEffect.createColorFilterEffect(colorFilter);
        createColorFilterEffect2.getClass();
        return new hl(createColorFilterEffect2);
    }

    public static final hl b(sv9 sv9Var) {
        RenderEffect createRuntimeShaderEffect = RenderEffect.createRuntimeShaderEffect(((sl) sv9Var).a, "content");
        createRuntimeShaderEffect.getClass();
        return new hl(createRuntimeShaderEffect);
    }

    public static final c3e c(c3e c3eVar, hl hlVar) {
        if (c3eVar != null) {
            RenderEffect createChainEffect = RenderEffect.createChainEffect(hlVar.n(), c3eVar.n());
            createChainEffect.getClass();
            return new hl(createChainEffect);
        }
        return hlVar;
    }

    public static o05 d(Bundle bundle) {
        Uri uri;
        bundle.getClass();
        try {
            String string = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID");
            String string2 = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN");
            String string3 = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_DISPLAY_NAME");
            String string4 = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FAMILY_NAME");
            String string5 = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GIVEN_NAME");
            if (Build.VERSION.SDK_INT >= 33) {
                uri = (Uri) bundle.getParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI", Uri.class);
            } else {
                uri = (Uri) bundle.getParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI");
            }
            Uri uri2 = uri;
            String string6 = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PHONE_NUMBER");
            string.getClass();
            string2.getClass();
            return new o05(string, string2, string3, string4, string5, uri2, string6);
        } catch (Exception e) {
            throw new e60(12, e);
        }
    }

    public static ArrayList e(Context context) {
        ActivityManager activityManager;
        List<ActivityManager.RunningAppProcessInfo> list;
        context.getClass();
        int i = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        if (systemService instanceof ActivityManager) {
            activityManager = (ActivityManager) systemService;
        } else {
            activityManager = null;
        }
        if (activityManager == null || (list = activityManager.getRunningAppProcesses()) == null) {
            list = ks3.a;
        }
        ArrayList a0 = sl1.a0(list);
        ArrayList arrayList = new ArrayList();
        int size = a0.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = a0.get(i3);
            i3++;
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(tl1.s(arrayList, 10));
        int size2 = arrayList.size();
        while (i2 < size2) {
            Object obj2 = arrayList.get(i2);
            i2++;
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) obj2;
            String str2 = runningAppProcessInfo.processName;
            str2.getClass();
            arrayList2.add(new o69(runningAppProcessInfo.pid, runningAppProcessInfo.importance, str2, c16.i(runningAppProcessInfo.processName, str)));
        }
        return arrayList2;
    }

    public static r40 f(AudioManager audioManager, l40 l40Var, qs5 qs5Var, List list) {
        List directProfilesForAttributes = audioManager.getDirectProfilesForAttributes(l40Var.a());
        HashMap hashMap = new HashMap();
        hashMap.put(2, new HashSet(hc2.f(12)));
        for (int i = 0; i < directProfilesForAttributes.size(); i++) {
            AudioProfile audioProfile = (AudioProfile) directProfilesForAttributes.get(i);
            if (audioProfile.getEncapsulationType() != 1) {
                int format = audioProfile.getFormat();
                if (a2d.M(format) || r40.h.containsKey(Integer.valueOf(format))) {
                    if (hashMap.containsKey(Integer.valueOf(format))) {
                        Set set = (Set) hashMap.get(Integer.valueOf(format));
                        set.getClass();
                        set.addAll(hc2.f(audioProfile.getChannelMasks()));
                    } else {
                        hashMap.put(Integer.valueOf(format), new HashSet(hc2.f(audioProfile.getChannelMasks())));
                    }
                }
            }
        }
        ls5 i2 = qs5.i();
        for (Map.Entry entry : hashMap.entrySet()) {
            i2.b(new q40(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
        }
        return new r40(i2.g(), qs5Var, list);
    }

    public static AudioDeviceInfo g(AudioManager audioManager, l40 l40Var) {
        audioManager.getClass();
        List audioDevicesForAttributes = audioManager.getAudioDevicesForAttributes(l40Var.a());
        if (audioDevicesForAttributes.isEmpty()) {
            return null;
        }
        return (AudioDeviceInfo) audioDevicesForAttributes.get(0);
    }

    public static int h() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 || (i >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
            return MediaStore.getPickImagesMaxLimit();
        }
        return Integer.MAX_VALUE;
    }

    public static o69 i(Context context) {
        Object obj;
        String p;
        context.getClass();
        int myPid = Process.myPid();
        ArrayList e = e(context);
        int size = e.size();
        int i = 0;
        while (true) {
            if (i < size) {
                obj = e.get(i);
                i++;
                if (((o69) obj).b == myPid) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        o69 o69Var = (o69) obj;
        if (o69Var == null) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 > 33) {
                p = Process.myProcessName();
                p.getClass();
            } else if ((i2 < 28 || (p = Application.getProcessName()) == null) && (p = ru.p()) == null) {
                p = "";
            }
            return new o69(myPid, 0, p, false);
        }
        return o69Var;
    }

    public static PackageInfo j(PackageManager packageManager, Context context) {
        return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
    }

    public static Object k(Bundle bundle, String str, Class cls) {
        return bundle.getParcelable(str, cls);
    }

    public static Object[] l(Bundle bundle, String str, Class cls) {
        return bundle.getParcelableArray(str, cls);
    }

    public static ArrayList m(Bundle bundle, String str, Class cls) {
        return bundle.getParcelableArrayList(str, cls);
    }

    public static Serializable n(Bundle bundle, String str, Class cls) {
        return bundle.getSerializable(str, cls);
    }

    public static SparseArray o(Bundle bundle, String str, Class cls) {
        return bundle.getSparseParcelableArray(str, cls);
    }

    public static String p(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    public static final BoringLayout.Metrics q(CharSequence charSequence, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic) {
        return BoringLayout.isBoring(charSequence, textPaint, textDirectionHeuristic, true, null);
    }

    public static final boolean r(BoringLayout boringLayout) {
        return boringLayout.isFallbackLineSpacingEnabled();
    }

    public static final boolean s(StaticLayout staticLayout) {
        return staticLayout.isFallbackLineSpacingEnabled();
    }

    public static boolean t(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    public static Parcelable u(Parcel parcel, ClassLoader classLoader, Class cls) {
        return (Parcelable) parcel.readParcelable(classLoader, cls);
    }

    public static final void v(i29 i29Var, yz7 yz7Var, pk pkVar) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher = i29Var.findOnBackInvokedDispatcher();
        if (findOnBackInvokedDispatcher == null) {
            return;
        }
        mb8 mb8Var = new mb8(findOnBackInvokedDispatcher, 1000000);
        yz7Var.b(mb8Var);
        pkVar.invoke(mb8Var);
    }

    public static final void w(CursorAnchorInfo.Builder builder, rk9 rk9Var) {
        builder.setEditorBoundsInfo(new EditorBoundsInfo.Builder().setEditorBounds(ipe.C(rk9Var)).setHandwritingBounds(ipe.C(rk9Var)).build());
    }

    public static final void x(CursorAnchorInfo.Builder builder, rk9 rk9Var) {
        builder.setEditorBoundsInfo(new EditorBoundsInfo.Builder().setEditorBounds(ipe.C(rk9Var)).setHandwritingBounds(ipe.C(rk9Var)).build());
    }

    public static void y(ShortcutInfo.Builder builder) {
        builder.setExcludedFromSurfaces(0);
    }

    public static final void z(StaticLayout.Builder builder, int i, int i2) {
        builder.setLineBreakConfig(new LineBreakConfig.Builder().setLineBreakStyle(i).setLineBreakWordStyle(i2).build());
    }
}
