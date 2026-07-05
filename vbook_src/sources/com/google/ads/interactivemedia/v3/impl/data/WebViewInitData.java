package com.google.ads.interactivemedia.v3.impl.data;

import android.webkit.WebView;
import com.google.ads.interactivemedia.v3.impl.data.AutoValue_WebViewInitData_JavaScriptNativeBridgeInitData;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public class WebViewInitData {
    public JavaScriptNativeBridgeInitData initData;
    public vle omidInitializer;
    public WebView webView;

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes.dex */
    public static abstract class JavaScriptNativeBridgeInitData {

        /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
        /* loaded from: classes.dex */
        public static abstract class Builder {
            public abstract JavaScriptNativeBridgeInitData build();

            public abstract Builder setAdTimeUpdateMs(Long l);

            public abstract Builder setAppSetIdTimeoutMs(Long l);

            public abstract Builder setConsentSettingsConfig(ConsentSettingsConfig consentSettingsConfig);

            public abstract Builder setDisableAppSetId(Boolean bool);

            public abstract Builder setDisableJsIdLessEvaluation(Boolean bool);

            public abstract Builder setEnableGks(Boolean bool);

            public abstract Builder setEnableInstrumentation(Boolean bool);

            public abstract Builder setEnableOmidJsManagedSessions(Boolean bool);

            public abstract Builder setEnableSeparateWebviewForDai(Boolean bool);

            public abstract Builder setEspAdapterTimeoutMs(Integer num);

            public abstract Builder setEspAdapters(List<String> list);

            public abstract Builder setGksDaiNativeXhrApps(List<String> list);

            public abstract Builder setGksFirstPartyAdServers(List<String> list);

            public abstract Builder setGksTimeoutMs(Integer num);

            public abstract Builder setJsConsentCheckRequiredParameters(Set<String> set);

            public abstract Builder setMsParameterTimeoutMs(Integer num);

            public abstract Builder setPlatformSignalCollectorTimeoutMs(Integer num);
        }

        /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
        /* loaded from: classes.dex */
        public static abstract class ConsentSettingsConfig {
            public static ConsentSettingsConfig create(Map<String, String> map) {
                return new AutoValue_WebViewInitData_JavaScriptNativeBridgeInitData_ConsentSettingsConfig(map);
            }

            public abstract Map<String, String> consentKeyTypes();
        }

        public static Builder builder() {
            return new AutoValue_WebViewInitData_JavaScriptNativeBridgeInitData.Builder();
        }

        public abstract Long adTimeUpdateMs();

        public abstract Long appSetIdTimeoutMs();

        public abstract ConsentSettingsConfig consentSettingsConfig();

        public abstract Boolean disableAppSetId();

        public abstract Boolean disableJsIdLessEvaluation();

        public abstract Boolean enableGks();

        public abstract Boolean enableInstrumentation();

        public abstract Boolean enableOmidJsManagedSessions();

        public abstract Boolean enableSeparateWebviewForDai();

        public abstract Integer espAdapterTimeoutMs();

        public abstract List<String> espAdapters();

        public abstract List<String> gksDaiNativeXhrApps();

        public abstract List<String> gksFirstPartyAdServers();

        public abstract Integer gksTimeoutMs();

        public abstract Set<String> jsConsentCheckRequiredParameters();

        public abstract Integer msParameterTimeoutMs();

        public abstract Integer platformSignalCollectorTimeoutMs();
    }

    public WebViewInitData(JavaScriptNativeBridgeInitData javaScriptNativeBridgeInitData, WebView webView, vle vleVar) {
        this.initData = javaScriptNativeBridgeInitData;
        this.webView = webView;
    }
}
