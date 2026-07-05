package defpackage;

import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wgd  reason: default package */
/* loaded from: classes.dex */
public abstract class wgd {
    public static final xgd a;

    static {
        xgd ox9Var;
        try {
            ox9Var = new k57((WebViewProviderFactoryBoundaryInterface) st0.e(WebViewProviderFactoryBoundaryInterface.class, kve.d()), 15);
        } catch (ClassNotFoundException unused) {
            ox9Var = new ox9(5);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            fb4.l(e);
            return;
        }
        a = ox9Var;
    }
}
