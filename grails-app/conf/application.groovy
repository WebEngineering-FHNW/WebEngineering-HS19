

// Added by the Spring Security Core plugin:
grails.plugin.springsecurity.userLookup.userDomainClassName = 'webec.SecUser'
grails.plugin.springsecurity.userLookup.authorityJoinClassName = 'webec.SecUserSecRole'
grails.plugin.springsecurity.authority.className = 'webec.SecRole'

grails.plugin.springsecurity.logout.postOnly = false

// go for an optimistic approach: all is allowed except when restricted in the staticRules
grails.plugin.springsecurity.rejectIfNoRule = false
grails.plugin.springsecurity.fii.rejectPublicInvocations = false


//grails.plugin.springsecurity.securityConfigType = "Annotation" // or "InterceptUrlMap"

grails.plugin.springsecurity.controllerAnnotations.staticRules = [
	[pattern: '/booking/*',      access: ['ROLE_USER']],
    // you might want to add more lines here ...
]

grails.plugin.springsecurity.filterChain.chainMap = [
	[pattern: '/assets/**',      filters: 'none'],
	[pattern: '/**/js/**',       filters: 'none'],
	[pattern: '/**/css/**',      filters: 'none'],
	[pattern: '/**/images/**',   filters: 'none'],
	[pattern: '/**/favicon.ico', filters: 'none'],
	[pattern: '/**',             filters: 'JOINED_FILTERS']
]

