package defpackage;

import android.os.Build;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pa9  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class pa9 implements vt4 {
    public final /* synthetic */ int a;

    public /* synthetic */ pa9(int i) {
        this.a = i;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        Object obj;
        boolean z = true;
        int i = 0;
        switch (this.a) {
            case 0:
                return new ya9(new lq(Float.valueOf((float) nae.e), fca.f, null, 12));
            case 1:
                return new m78("com.reader.app.ui.screen.reader.ReaderNERSkipListRoute", wh9.INSTANCE, new Annotation[0]);
            case 2:
                return v9e.o("reader_settings");
            case 3:
                return new m78("com.reader.app.ui.screen.reader.ReaderQtGeneralNameRoute", bi9.INSTANCE, new Annotation[0]);
            case 4:
                return new m78("com.reader.app.ui.screen.reader.ReaderQtGeneralVPRoute", ci9.INSTANCE, new Annotation[0]);
            case 5:
                return yae.z(Boolean.FALSE);
            case 6:
                return new m78("com.reader.app.ui.screen.reader.ReaderTextTrashRoute", ej9.INSTANCE, new Annotation[0]);
            case 7:
                List u0 = sl1.u0((List) naa.a.getValue(), new pa5(22));
                ArrayList arrayList = new ArrayList();
                int size = u0.size();
                while (i < size) {
                    ((sa6) u0.get(i)).getClass();
                    arrayList.add(new yk8(new l18(new v16(18)), cm9.a(lyc.class)));
                    i++;
                }
                return arrayList;
            case 8:
                List u02 = sl1.u0((List) naa.b.getValue(), new pa5(23));
                ArrayList arrayList2 = new ArrayList();
                int size2 = u02.size();
                while (i < size2) {
                    ((hy4) u02.get(i)).getClass();
                    if (Build.VERSION.SDK_INT >= 28) {
                        obj = new gr();
                    } else {
                        obj = new Object();
                    }
                    arrayList2.add(obj);
                    i++;
                }
                return arrayList2;
            case 9:
                return null;
            case 10:
                return vq9.a;
            case 11:
                tza tzaVar = fr9.a;
                return ns2.a;
            case 12:
                r07 r07Var = new r07();
                r07Var.putAll(hr9.d);
                r07Var.putAll(hr9.e);
                return r07Var.b();
            case 13:
                ly1 ly1Var = jt9.a;
                return ase.b;
            case 14:
                return Boolean.valueOf(ngb.a("ro.mi.os.version.name"));
            case 15:
                return Boolean.valueOf(ngb.b("ro.miui.ui.version.name").equals("V816"));
            case 16:
                return Boolean.valueOf(au9.a("android.miui.R"));
            case 17:
                return Boolean.valueOf(au9.a("com.vivo.VivoSystemFrameworkFactory"));
            case 18:
                return Boolean.valueOf(au9.a("vivo.R"));
            case 19:
                if (!au9.a("ohos.system.version.SystemVersion") || k4b.j0(ngb.b("ro.build.ohos.devicetype")) || (k4b.j0(ngb.b("ro.build.hide.matchers")) && k4b.j0(ngb.b("ro.build.hide.replacements")))) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 20:
                if (((Boolean) au9.f.getValue()).booleanValue() || (!au9.a("androidhwext.R") && !au9.a("com.huawei.android.app.HwActivityManager"))) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 21:
                if (!((Boolean) au9.c.getValue()).booleanValue() || ((Boolean) au9.a.getValue()).booleanValue() || ((Boolean) au9.b.getValue()).booleanValue()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 22:
                if (!((Boolean) au9.c.getValue()).booleanValue() || (!((Boolean) au9.a.getValue()).booleanValue() && !((Boolean) au9.b.getValue()).booleanValue())) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 23:
                if (!au9.a("oppo.R") && !au9.a("oplus.R") && !au9.a("com.color.os.ColorBuild")) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 24:
                if (!((Boolean) au9.e.getValue()).booleanValue() || ((Boolean) au9.d.getValue()).booleanValue()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 25:
                if (!((Boolean) au9.e.getValue()).booleanValue() || !((Boolean) au9.d.getValue()).booleanValue()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 26:
                if (!au9.a("flyme.app.IActivityManagerExt") && !au9.a("flyme.config.FlymeFeature") && !au9.a("com.meizu.server.AppOpsHandle")) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 27:
                if (!au9.a("com.samsung.android.ProductPackagesRune") && !au9.a("com.samsung.epic.request") && !au9.a("knox.security.keystore.KnoxAndroidKeyStoreSpi")) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 28:
                if (!au9.a("com.zui.internal.app.IAppFaceService") && !au9.a("zuisdk.app.AlertActivity") && !au9.a("zui.icon.ExtraResources") && !au9.a("com.zui.internal.app.ZuiShutdownActivity")) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                if (!au9.a("cn.nubia.internal.R") && !au9.a("com.nubia.internal.R") && !au9.a("cn.nubia.tcsystem.INubiaTcSystemCallback") && !au9.a("com.nubia.tcsystem.INubiaTcSystemCallback")) {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
