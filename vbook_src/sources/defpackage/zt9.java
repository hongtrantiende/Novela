package defpackage;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.ServiceConfigurationError;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zt9  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class zt9 implements vt4 {
    public final /* synthetic */ int a;

    public /* synthetic */ zt9(int i) {
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r6v11, types: [sa6, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [hy4, java.lang.Object] */
    @Override // defpackage.vt4
    public final Object invoke() {
        ServiceConfigurationError serviceConfigurationError;
        boolean z = true;
        switch (this.a) {
            case 0:
                if ((!au9.a("com.zte.PlatformConfig") && !au9.a("com.zte.zsdk.IPolicyManager") && !au9.a("zpub.res.R")) || !au9.a("nubia.util.BlurUtil")) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                if (!au9.a("com.asus.cta.CtaAction") && !au9.a("com.asus.ims.rogproxy.IRogProxy")) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                if (!au9.a("com.hmct.epd.EpdManager") && !au9.a("com.hmct.facelock.IDetectedCallback") && !au9.a("com.hmct.ThemeUtils.ConfigNotifier") && !au9.a("com.hmct.ThemeUtils.FontUtil") && !au9.a("com.hmct.ThemeUtils.FontUtilException") && !au9.a("com.hmct.ThemeUtils.ThemeUtil")) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 3:
                return new uv9();
            case 4:
                return new vv9();
            case 5:
                return new wv9();
            case 6:
                return new tx9(new LinkedHashMap());
            case 7:
                tza tzaVar = ay9.a;
                return null;
            case 8:
                return uu9.a;
            case 9:
                return new mea(6.0f, zl1.b(0.06f, zl1.b), 26);
            case 10:
                return c65.e;
            case 11:
                return new mea(6.0f, zl1.b(0.06f, zl1.b), 26);
            case 12:
                return uu9.a;
            case 13:
                return c65.e;
            case 14:
                return new lz9(mz9.a(1.0f, 1.0f));
            case 15:
                return new HashSet();
            case 16:
                throw new IllegalStateException("No ScreenController provided");
            case 17:
                return new k2a(0);
            case 18:
                return new n7a(1L);
            case 19:
                ly1 ly1Var = o7a.a;
                return null;
            case 20:
                return new q7a();
            case 21:
                try {
                    return que.w(g9a.e0(g9a.b0(Arrays.asList(new Object()).iterator())));
                } finally {
                }
            case 22:
                try {
                    return que.w(g9a.e0(g9a.b0(Arrays.asList(new Object()).iterator())));
                } finally {
                }
            case 23:
                return new b45(c4b.a, j69.a, 1);
            case 24:
                return new m78("com.reader.app.ui.screen.setting.SettingAiTtsModelRoute", hca.INSTANCE, new Annotation[0]);
            case 25:
                return new m78("com.reader.app.ui.screen.setting.SettingConnectionRoute", ica.INSTANCE, new Annotation[0]);
            case 26:
                return new m78("com.reader.app.ui.screen.setting.SettingContextMenuRoute", jca.INSTANCE, new Annotation[0]);
            case 27:
                return new m78("com.reader.app.ui.screen.setting.SettingDomainOverrideRoute", kca.INSTANCE, new Annotation[0]);
            case 28:
                return new m78("com.reader.app.ui.screen.setting.SettingFontListRoute", mca.INSTANCE, new Annotation[0]);
            default:
                return new m78("com.reader.app.ui.screen.setting.SettingFontRoute", nca.INSTANCE, new Annotation[0]);
        }
    }
}
